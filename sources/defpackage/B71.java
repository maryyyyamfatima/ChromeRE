package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.io.File;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class B71 extends C12008z71 {
    public final C4502dG0 b;

    public B71(C4502dG0 c4502dG0) {
        this.b = c4502dG0;
    }

    @Override // defpackage.C12008z71
    public final void c(Activity activity, String str, AbstractRunnableC9679sL0 abstractRunnableC9679sL0) {
        boolean z;
        if (this.b.a(new U44())) {
            z = false;
        } else {
            C12008z71.b(activity);
            z = true;
        }
        if (z) {
            return;
        }
        FX2 fx2 = abstractRunnableC9679sL0.l;
        Bitmap bitmap = null;
        if ((fx2 == null ? null : fx2.b()) == null) {
            AbstractC4851eH1.d("cr_feedback", "Screenshot not provided. Using GoogleHelp to take screenshot.", new Object[0]);
            try {
                View rootView = activity.getWindow().getDecorView().getRootView();
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.RGB_565);
                    rootView.draw(new Canvas(createBitmap));
                    bitmap = createBitmap;
                } catch (Error | Exception e) {
                    Log.w("gF_FeedbackClient", "Get screenshot failed!", e);
                }
            } catch (Exception e2) {
                Log.w("gF_FeedbackClient", "Get screenshot failed!", e2);
            }
            if (bitmap == null) {
                AbstractC4851eH1.f("cr_feedback", "GoogleHelp unable to take screenshot. Giving up getting screenshot.", new Object[0]);
            } else {
                C1484Lk3 c1484Lk3 = new C1484Lk3(bitmap);
                abstractRunnableC9679sL0.l = c1484Lk3;
                c1484Lk3.c(abstractRunnableC9679sL0);
            }
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            File cacheDir = activity.getCacheDir();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            GoogleHelp googleHelp = new GoogleHelp(18, str, null, null, null, null, null, true, true, new ArrayList(), null, null, null, 0, 0, null, null, new ArrayList(), 3, null, new ArrayList(), false, new ErrorReport(), null, 0, null, -1, false, false, 200, null, false, null, false, null, false, new ArrayList());
            ErrorReport errorReport = new ErrorReport(AL0.a(abstractRunnableC9679sL0).a(), cacheDir);
            googleHelp.A = errorReport;
            errorReport.c0 = "GoogleHelp";
            googleHelp.v = Uri.parse("https://support.google.com/chrome/topic/6069782");
            ThemeSettings themeSettings = new ThemeSettings();
            themeSettings.a = AbstractC3899bX.e(activity) ? 2 : 0;
            googleHelp.x = themeSettings;
            Intent putExtra = new Intent("com.google.android.gms.googlehelp.HELP").setPackage("com.google.android.gms").putExtra("EXTRA_GOOGLE_HELP", googleHelp);
            allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                new C4431d31(activity).a(putExtra);
            } finally {
            }
        } finally {
        }
    }

    @Override // defpackage.C12008z71
    public final void e(Activity activity, AbstractRunnableC9679sL0 abstractRunnableC9679sL0) {
        boolean z;
        if (this.b.a(new U44())) {
            z = false;
        } else {
            C12008z71.b(activity);
            z = true;
        }
        if (z) {
            return;
        }
        Context applicationContext = activity.getApplicationContext();
        C3588ad c3588ad = AbstractC7964nL0.a;
        C8308oL0 c8308oL0 = new C8308oL0(applicationContext);
        FeedbackOptions a = AL0.a(abstractRunnableC9679sL0).a();
        long nanoTime = System.nanoTime();
        C6144i21 c6144i21 = c8308oL0.h;
        C7276lL0 c7276lL0 = new C7276lL0(c6144i21, a, c6144i21.b.a, nanoTime);
        c6144i21.b.c(0, c7276lL0);
        AbstractC7799mr2.b(c7276lL0).c(new InterfaceC2872Wc2() { // from class: A71
            @Override // defpackage.InterfaceC2872Wc2
            public final void c(Exception exc) {
                AbstractC4851eH1.f("cr_feedback", "Could not successfully launch Google Feedback", exc);
            }
        });
    }
}
