package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.widget.PopupWindow;
import android.widget.Toast;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: r04, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9225r04 {
    public static C9225r04 a;

    public static C9225r04 d() {
        if (a == null) {
            a = new C9225r04();
        }
        return a;
    }

    public PopupWindow b(Context context) {
        return new PopupWindow(context);
    }

    public AlertDialog a(Context context) {
        return new AlertDialog.Builder(context).create();
    }

    public Toast c(Context context) {
        return new Toast(context);
    }
}
