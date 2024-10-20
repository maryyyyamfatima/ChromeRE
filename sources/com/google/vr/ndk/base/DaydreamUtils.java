package com.google.vr.ndk.base;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.google.vr.sdk.proto.nano.CardboardDevice$DeviceParams;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public abstract class DaydreamUtils {
    private static boolean sDaydreamPhoneOverrideForTesting;

    public static boolean isDaydreamPhone(Context context) {
        if (sDaydreamPhoneOverrideForTesting) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        return context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance");
    }

    public static boolean isDaydreamViewer(CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
        return (cardboardDevice$DeviceParams == null || cardboardDevice$DeviceParams.daydreamInternal == null) ? false : true;
    }

    public static DaydreamCompatibility getComponentDaydreamCompatibility(Context context, ComponentName componentName) {
        return getComponentDaydreamCompatibility(context.getPackageManager(), componentName);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DaydreamCompatibility getComponentDaydreamCompatibility(PackageManager packageManager, ComponentName componentName) {
        boolean checkHeadsetCompatibility = checkHeadsetCompatibility(packageManager, componentName, "com.google.intent.category.DAYDREAM");
        boolean z = checkHeadsetCompatibility;
        if (checkHeadsetCompatibility(packageManager, componentName, "com.google.intent.category.CARDBOARD")) {
            z = (checkHeadsetCompatibility ? 1 : 0) | 2;
        }
        int i = z;
        if (checkHeadsetCompatibility(packageManager, componentName, "com.google.intent.category.DAYDREAM_CONTROLLER_OPTIONAL")) {
            i = (z ? 1 : 0) | 4;
        }
        return new DaydreamCompatibility(i);
    }

    private static boolean checkHeadsetCompatibility(PackageManager packageManager, ComponentName componentName, String str) {
        Intent intent = new Intent();
        intent.setPackage(componentName.getPackageName());
        intent.addCategory(str);
        return canResolveIntent(packageManager, componentName, intent);
    }

    private static boolean canResolveIntent(PackageManager packageManager, ComponentName componentName, Intent intent) {
        ActivityInfo activityInfo;
        String str;
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 128);
        if (queryIntentActivities == null) {
            return false;
        }
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            if (resolveInfo != null && (activityInfo = resolveInfo.activityInfo) != null && (str = activityInfo.name) != null && str.equals(componentName.getClassName())) {
                return true;
            }
        }
        return false;
    }
}
