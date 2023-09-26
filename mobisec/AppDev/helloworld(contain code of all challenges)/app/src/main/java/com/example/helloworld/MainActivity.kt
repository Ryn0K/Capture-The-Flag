package com.example.helloworld

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.result.contract.ActivityResultContracts
import com.android.volley.Request
import com.android.volley.VolleyError
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley


class MainActivity : ComponentActivity() {
    //justlisten code
    //    lateinit var receiver: MyBroadcastReceiver;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //justlisten code
//        receiver = MyBroadcastReceiver();
//        registerReceiver(receiver, IntentFilter("com.mobisec.intent.action.FLAG_ANNOUNCEMENT"));


        //reachingout code
//        val url ="http://10.0.2.2:31337/flag"
//        val queue = Volley.newRequestQueue(applicationContext);
//        val params = HashMap<String, String>()
//        params["answer"]= "9"
//        params["val1"] = "3"
//        params["oper"] = "+"
//        params["val2"] = "6"
//        val request = object: StringRequest(
//            Request.Method.POST, url,
//            { response ->
//                Log.e("MOBISEC", response.toString())
//           },
//            {error: VolleyError -> Log.e("MOBISEC", error.toString())}){
//            override fun getParams():Map<String,String>{
//                return params
//            }
//        }
//        queue.add(request)
//

        //justask code
//        val getResult = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
//            if(it.resultCode == RESULT_OK){
//                Log.i("MOBISEC", it.data?.getStringExtra("flag").toString())
//            }
//        }
//        val getResult = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
//            if(it.resultCode == RESULT_OK){
//                val bundle = it.data?.extras
//                if(bundle != null){
//                    for(key in bundle.keySet()){
//                        Log.e(
//                            "MOBISEC",
//                            key.toString() + " : " + if (bundle.get(key) != null) bundle.get(key) else "NULL"
//                        )
//                    }
//                }
//            }
//        }
//        fun getBundle(bundle: Bundle?){
//           if(bundle != null) {
//               for (key in bundle.keySet()){
//                   if((bundle.get(key) !=null) && (bundle.get(key) is Bundle)){
//                       getBundle(bundle.get(key) as Bundle)
//                   }
//                   Log.e(
//                       "MOBISEC",
//                       key.toString() + " : " + if (bundle.get(key) != null) bundle.get(key) else "NULL"
//                   )
//               }
//           }
//        }
//        val getResult2 = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
//            if(it.resultCode == RESULT_OK){
//                getBundle(it.data?.extras)
//            }
//        }
//        val intent = Intent()
//        intent.setClassName("com.mobisec.justask","com.mobisec.justask.PartOne")
//        getResult.launch(intent)
//
//        val intent2 = Intent()
//        intent2.setClassName("com.mobisec.justask","com.mobisec.justask.PartTwo")
//        intent2.action = "com.mobisec.intent.action.JUSTASK"
//        getResult.launch(intent2)
//
//        val intent3 = Intent()
//        intent3.setClassName("com.mobisec.justask","com.mobisec.justask.PartThree")
//        getResult.launch(intent3)
//
//        val intent4 = Intent()
//        intent4.setClassName("com.mobisec.justask","com.mobisec.justask.PartFour")
//        intent4.action="com.mobisec.intent.action.JUSTASKBUTNOTSOSIMPLE"
//        getResult2.launch(intent4)

    }
}


// justlisten code
//class MyBroadcastReceiver : BroadcastReceiver(){
//    override fun onReceive(p0: Context?, p1: Intent?) {
//        val flag = p1?.extras?.getString("flag");
//        if (flag != null) {
//            Log.i("MOBISEC",flag)
//        };
//    }
//}