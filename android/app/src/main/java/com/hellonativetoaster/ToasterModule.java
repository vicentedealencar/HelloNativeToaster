package com.hellonativetoaster;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import java.util.HashMap;
import android.util.Log;
import android.widget.Toast;

public class ToasterModule extends ReactContextBaseJavaModule {
    ToasterModule(ReactApplicationContext context) {
        super(context);
    }

    @Override
    public String getName() {
        return "ToasterModule";
    }

    @ReactMethod
    public void show(String message, int duration, Promise promise) {
        String text ="AE: " + message + " time: " + duration;
        Log.d("ToasterModule", text);
        Toast.makeText(this.getReactApplicationContext(), text, duration).show();
        promise.resolve(message + " ! (from java)");
    }


}

