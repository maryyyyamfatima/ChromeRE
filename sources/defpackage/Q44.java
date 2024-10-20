package defpackage;

import J.N;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import android.widget.PopupWindow;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.feature_engagement.TriggerDetails;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Q44 {
    public final Activity a;
    public final Handler b;

    public Q44(Activity activity, Handler handler) {
        this.a = activity;
        this.b = handler;
    }

    public final void a(final C11837ye1 c11837ye1) {
        if (c11837ye1 == null) {
            return;
        }
        TraceEvent i = TraceEvent.i("UserEducationHelper::requestShowIPH", null);
        try {
            final KU3 a = LU3.a(Profile.d());
            a.d(new Callback() { // from class: M44
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                /* JADX WARN: Type inference failed for: r12v6, types: [N44] */
                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    Yc4 yc4;
                    C3823bH3 c3823bH3;
                    final KU3 ku3 = a;
                    final Q44 q44 = Q44.this;
                    q44.getClass();
                    final C11837ye1 c11837ye12 = c11837ye1;
                    final View view = c11837ye12.h;
                    Activity activity = q44.a;
                    boolean isFinishing = activity.isFinishing();
                    Runnable runnable = c11837ye12.k;
                    if (isFinishing || activity.isDestroyed() || view == null) {
                        runnable.run();
                        return;
                    }
                    final String str = c11837ye12.b;
                    Rect rect = c11837ye12.p;
                    LI2 li2 = rect != null ? new LI2(rect) : null;
                    ViewTreeObserverOnGlobalLayoutListenerC8754pe4 viewTreeObserverOnGlobalLayoutListenerC8754pe4 = c11837ye12.n;
                    if (viewTreeObserverOnGlobalLayoutListenerC8754pe4 == null && li2 == null) {
                        viewTreeObserverOnGlobalLayoutListenerC8754pe4 = new ViewTreeObserverOnGlobalLayoutListenerC8754pe4(view);
                    }
                    Yc4 yc42 = c11837ye12.o;
                    C7928nE c7928nE = UN.a;
                    TriggerDetails e = N.M09VlOh_("IPH_Snooze") ? ku3.e(str) : new TriggerDetails(ku3.shouldTriggerHelpUI(str), false);
                    if (!e.a) {
                        runnable.run();
                        return;
                    }
                    if (N.M09VlOh_("AndroidScrollOptimizations")) {
                        String str2 = c11837ye12.d;
                        Resources resources = c11837ye12.a;
                        if (str2 == null) {
                            c11837ye12.d = resources.getString(c11837ye12.c);
                        }
                        if (c11837ye12.f == null) {
                            c11837ye12.f = resources.getString(c11837ye12.e);
                        }
                        if (c11837ye12.l == null && rect == null) {
                            c11837ye12.l = new Rect(0, 0, 0, resources.getDimensionPixelOffset(R.dimen.f34380_resource_name_obfuscated_res_0x7f08038e));
                        }
                    }
                    String str3 = c11837ye12.d;
                    String str4 = c11837ye12.f;
                    boolean z = e.b;
                    boolean z2 = z && !N.M09VlOh_("EnableAutomaticSnooze");
                    boolean z3 = N.M09VlOh_("EnableAutomaticSnooze") && z;
                    boolean z4 = c11837ye12.q;
                    if (z2) {
                        yc4 = yc42;
                        c3823bH3 = new C3823bH3(q44.a, view, str3, str4, true ^ z4, viewTreeObserverOnGlobalLayoutListenerC8754pe4 != null ? viewTreeObserverOnGlobalLayoutListenerC8754pe4 : li2, null, false, C10021tL.f().c(), new Runnable() { // from class: N44
                            @Override // java.lang.Runnable
                            public final void run() {
                                KU3.this.dismissedWithSnooze(str, 1);
                            }
                        });
                    } else {
                        yc4 = yc42;
                        c3823bH3 = new C3823bH3(q44.a, view, str3, str4, !z4, viewTreeObserverOnGlobalLayoutListenerC8754pe4 != null ? viewTreeObserverOnGlobalLayoutListenerC8754pe4 : li2, C10021tL.f().c());
                    }
                    c3823bH3.i.u = c11837ye12.r;
                    c3823bH3.g(c11837ye12.g);
                    final boolean z5 = z3;
                    ViewTreeObserverOnGlobalLayoutListenerC8754pe4 viewTreeObserverOnGlobalLayoutListenerC8754pe42 = viewTreeObserverOnGlobalLayoutListenerC8754pe4;
                    final Yc4 yc43 = yc4;
                    c3823bH3.a(new PopupWindow.OnDismissListener() { // from class: O44
                        @Override // android.widget.PopupWindow.OnDismissListener
                        public final void onDismiss() {
                            final boolean z6 = z5;
                            final KU3 ku32 = ku3;
                            final String str5 = str;
                            final C11837ye1 c11837ye13 = c11837ye12;
                            final Yc4 yc44 = yc43;
                            final View view2 = view;
                            Q44 q442 = Q44.this;
                            q442.getClass();
                            q442.b.postDelayed(new Runnable() { // from class: P44
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z7 = z6;
                                    KU3 ku33 = ku32;
                                    String str6 = str5;
                                    if (z7) {
                                        ku33.dismissedWithSnooze(str6, 1);
                                    }
                                    if (str6 != null) {
                                        ku33.dismissed(str6);
                                    }
                                    c11837ye13.i.run();
                                    if (yc44 != null) {
                                        AbstractC3593ad4.a(view2);
                                    }
                                }
                            }, 200L);
                        }
                    });
                    c3823bH3.f(c11837ye12.m);
                    Yc4 yc44 = yc4;
                    if (yc44 != null) {
                        AbstractC3593ad4.b(view, yc44);
                    }
                    if (viewTreeObserverOnGlobalLayoutListenerC8754pe42 != null) {
                        viewTreeObserverOnGlobalLayoutListenerC8754pe42.e(c11837ye12.l);
                    }
                    c3823bH3.h();
                    c11837ye12.j.run();
                }
            });
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
