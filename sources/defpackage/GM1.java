package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class GM1 {
    public static final int[] a = {R.attr.theme, com.android.chrome.R.attr.f14190_resource_name_obfuscated_res_0x7f0504b8};
    public static final int[] b = {com.android.chrome.R.attr.f10220_resource_name_obfuscated_res_0x7f05032b};

    public static Context a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z = (context instanceof R60) && ((R60) context).a == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        R60 r60 = new R60(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            r60.getTheme().applyStyle(resourceId2, true);
        }
        return r60;
    }
}
