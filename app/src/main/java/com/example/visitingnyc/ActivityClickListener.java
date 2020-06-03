package com.example.visitingnyc;

import android.content.Context;
import android.content.Intent;
import android.view.View;

public class ActivityClickListener implements View.OnClickListener{
    public Class actvityClass;

    public ActivityClickListener(Class _class){
        this.actvityClass=_class;
    }

    @Override
    public void onClick(View view) {
        Context context=view.getContext();
        Intent intent = new Intent(context, actvityClass);
        context.startActivity(intent);
    }
}
