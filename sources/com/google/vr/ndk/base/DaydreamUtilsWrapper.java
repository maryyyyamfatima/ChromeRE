package com.google.vr.ndk.base;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import defpackage.U60;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public class DaydreamUtilsWrapper {
    public boolean isDaydreamActivity(Activity activity) {
        return isDaydreamComponent(activity);
    }

    public boolean isDaydreamComponent(Context context) {
        return getComponentDaydreamCompatibility(context).supportsDaydream();
    }

    public boolean isDaydreamRequiredComponent(Context context) {
        return getComponentDaydreamCompatibility(context).requiresDaydream();
    }

    public boolean isDaydreamPhone(Context context) {
        return DaydreamUtils.isDaydreamPhone(context);
    }

    public DaydreamCompatibility getComponentDaydreamCompatibility(Context context) {
        Activity a = U60.a(context);
        ComponentName componentName = a != null ? a.getComponentName() : null;
        if (componentName != null) {
            return DaydreamUtils.getComponentDaydreamCompatibility(context, componentName);
        }
        return new DaydreamCompatibility();
    }
}
