package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.android.chrome.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iv0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6445iv0 {
    public static final int[] a = {R.attr.f6590_resource_name_obfuscated_res_0x7f0501c0};
    public static final Map b;
    public static final Map c;

    static {
        C5415fv0 c5415fv0 = new C5415fv0();
        C5759gv0 c5759gv0 = new C5759gv0();
        HashMap hashMap = new HashMap();
        hashMap.put("google", c5415fv0);
        hashMap.put("hmd global", c5415fv0);
        hashMap.put("infinix", c5415fv0);
        hashMap.put("infinix mobility limited", c5415fv0);
        hashMap.put("itel", c5415fv0);
        hashMap.put("kyocera", c5415fv0);
        hashMap.put("lenovo", c5415fv0);
        hashMap.put("lge", c5415fv0);
        hashMap.put("motorola", c5415fv0);
        hashMap.put("nothing", c5415fv0);
        hashMap.put("oneplus", c5415fv0);
        hashMap.put("oppo", c5415fv0);
        hashMap.put("realme", c5415fv0);
        hashMap.put("robolectric", c5415fv0);
        hashMap.put("samsung", c5759gv0);
        hashMap.put("sharp", c5415fv0);
        hashMap.put("sony", c5415fv0);
        hashMap.put("tcl", c5415fv0);
        hashMap.put("tecno", c5415fv0);
        hashMap.put("tecno mobile limited", c5415fv0);
        hashMap.put("vivo", c5415fv0);
        hashMap.put("xiaomi", c5415fv0);
        b = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("asus", c5415fv0);
        hashMap2.put("jio", c5415fv0);
        c = Collections.unmodifiableMap(hashMap2);
    }

    public static void a(Activity activity) {
        View peekDecorView;
        Context context;
        if (b()) {
            TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(a);
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            obtainStyledAttributes.recycle();
            if (resourceId != 0) {
                activity.getTheme().applyStyle(resourceId, true);
                Window window = activity.getWindow();
                Resources.Theme theme = (window == null || (peekDecorView = window.peekDecorView()) == null || (context = peekDecorView.getContext()) == null) ? null : context.getTheme();
                if (theme != null) {
                    theme.applyStyle(resourceId, true);
                }
            }
        }
    }

    public static boolean b() {
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        if (AbstractC6205iD.a()) {
            return true;
        }
        InterfaceC6103hv0 interfaceC6103hv0 = (InterfaceC6103hv0) b.get(Build.MANUFACTURER.toLowerCase());
        if (interfaceC6103hv0 == null) {
            interfaceC6103hv0 = (InterfaceC6103hv0) c.get(Build.BRAND.toLowerCase());
        }
        return interfaceC6103hv0 != null && interfaceC6103hv0.a();
    }
}
