package defpackage;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.Constructor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Dg */
/* loaded from: classes.dex */
public class C0420Dg {
    public static final Class[] b = {Context.class, AttributeSet.class};
    public static final int[] c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};
    public static final int[] e = {R.attr.accessibilityPaneTitle};
    public static final int[] f = {R.attr.screenReaderFocusable};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};
    public static final C1439Lb3 h = new C1439Lb3();
    public final Object[] a = new Object[2];

    public C10475ug e(Context context, AttributeSet attributeSet) {
        return new C10475ug(context, attributeSet);
    }

    public C4287cf b(Context context, AttributeSet attributeSet) {
        return new C4287cf(context, attributeSet, com.android.chrome.R.attr.0_resource_name_obfuscated_res_0x7f050086);
    }

    public C4974ef c(Context context, AttributeSet attributeSet) {
        return new C4974ef(context, attributeSet);
    }

    public C2494Tf d(Context context, AttributeSet attributeSet) {
        return new C2494Tf(context, attributeSet);
    }

    public C3600af a(Context context, AttributeSet attributeSet) {
        return new C3600af(context, attributeSet);
    }

    public final void g(TextView textView, String str) {
        if (textView != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        C1439Lb3 c1439Lb3 = h;
        Constructor constructor = (Constructor) c1439Lb3.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(b);
            c1439Lb3.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.a);
    }
}
