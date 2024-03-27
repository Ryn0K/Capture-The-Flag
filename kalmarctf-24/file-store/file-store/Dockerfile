FROM python:3.11-slim

RUN python3 -m pip install flask flask-session gunicorn

RUN useradd ctf

COPY flag.txt /flag.txt

WORKDIR /app
COPY app.py .
COPY templates/ templates/
COPY static/style.css static/

RUN mkdir -p static/uploads flask_session
RUN chmod 777 static/uploads flask_session

USER ctf

CMD gunicorn --bind :5000 app:app
