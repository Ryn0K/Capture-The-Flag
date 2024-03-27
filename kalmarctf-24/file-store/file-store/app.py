from flask import Flask, request, render_template, redirect, session
from flask_session import Session
import os

SESSION_TYPE = 'filesystem'
MAX_CONTENT_LENGTH = 1024 * 1024

app = Flask(__name__)
app.config.from_object(__name__)
Session(app)

@app.route('/', methods=['GET', 'POST'])
def index():
    path = f'static/uploads/{session.sid}' 
    if request.method == 'POST':
        f = request.files['file']
        if '..' in f.filename:
            return "bad", 400
        os.makedirs(path, exist_ok=True)
        f.save(path + '/' + f.filename)
        if not session.get('files'):
            session['files'] = []
        session['files'].append(f.filename)
        return redirect('/')
    return render_template('index.html', path=path, files=session.get('files', []))

if __name__ == "__main__":
    app.run(host='0.0.0.0')
