package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.lang.ref.WeakReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: d31 */
/* loaded from: classes.dex */
public final class C4431d31 {
    public final Activity a;
    public final C3744b31 b;

    public C4431d31(Activity activity) {
        this.a = activity;
        this.b = new C3744b31(activity);
    }

    public final void a(Intent intent) {
        if (!intent.getAction().equals("com.google.android.gms.googlehelp.HELP") || !intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            throw new IllegalArgumentException("The intent you are trying to launch is not GoogleHelp intent! This class only supports GoogleHelp intents.");
        }
        int i = W31.e;
        Activity activity = this.a;
        int d = X31.d(activity, 11925000);
        if (d == 0) {
            Y21 y21 = (Y21) this.b.get();
            X21 x21 = Y21.l;
            x21.getClass();
            WeakReference weakReference = new WeakReference(y21.k);
            C6144i21 c6144i21 = y21.h;
            U21 u21 = new U21(x21, c6144i21, intent, weakReference);
            c6144i21.b.c(0, u21);
            AbstractC7799mr2.b(u21);
            return;
        }
        final Intent data = new Intent("android.intent.action.VIEW").setData(((GoogleHelp) intent.getParcelableExtra("EXTRA_GOOGLE_HELP")).v);
        if (d != 7 && (!activity.getPackageManager().queryIntentActivities(data, 0).isEmpty())) {
            new HandlerC10413uU3(Looper.getMainLooper()).post(new Runnable() { // from class: c31
                @Override // java.lang.Runnable
                public final void run() {
                    C4431d31.this.a.startActivity(data);
                }
            });
            return;
        }
        if (X31.e(activity, d)) {
            d = 18;
        }
        AlertDialog d2 = C8543p11.d.d(d, 0, activity, null);
        if (d2 == null) {
            return;
        }
        C8543p11.i(activity, d2, "GooglePlayServicesErrorDialog", null);
    }
}
