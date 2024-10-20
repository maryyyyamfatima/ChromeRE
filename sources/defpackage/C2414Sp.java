package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2414Sp implements InterfaceC3999bo0 {
    public final View a;
    public final C6166i6 b;

    @Override // defpackage.InterfaceC3999bo0
    public final void b(C3185Yn0 c3185Yn0) {
        if (AbstractC6072hq.a(true)) {
            if (!AbstractC6072hq.b()) {
                C3055Xn0 a = c3185Yn0.a("onboarding");
                a.a("name", 0, false);
                a.a("experiment_ids", 0, false);
                a.b();
                C3055Xn0 a2 = c3185Yn0.a("onboarding_and_start");
                a2.a("name", 0, true);
                a2.a("user_name", 0, false);
                a2.a("experiment_ids", 0, false);
                a2.a("show_error_on_failure", 1, false);
                a2.b();
                return;
            }
            Object obj = ThreadUtils.a;
            C3055Xn0 a3 = c3185Yn0.a("fetch_website_actions");
            a3.a("user_name", 0, false);
            a3.a("experiment_ids", 0, false);
            a3.b();
        }
    }

    public final void c(final Callback callback, boolean z) {
        if (AbstractC3194Yp.b()) {
            AbstractC3194Yp.a();
        }
        if (!z) {
            callback.onResult(null);
            return;
        }
        Tab tab = (Tab) this.b.g;
        if (tab == null) {
            callback.onResult(null);
            return;
        }
        Callback callback2 = new Callback() { // from class: Rp
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                X5.a(obj);
                C2414Sp.this.getClass();
                callback.onResult(null);
            }
        };
        C0180Bk c0180Bk = new C0180Bk(tab);
        if (AbstractC3194Yp.b()) {
            AbstractC3194Yp.a();
        }
        C4353cq.a(callback2, c0180Bk, true);
    }

    public C2414Sp(Context context, QB qb, CompositorViewHolder compositorViewHolder, C6166i6 c6166i6, C2674Up c2674Up) {
        this.a = compositorViewHolder;
        this.b = c6166i6;
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [Pp] */
    /* JADX WARN: Type inference failed for: r7v0, types: [Np] */
    @Override // defpackage.InterfaceC3999bo0
    public final boolean a(final String str, final Bundle bundle, final C2925Wn0 c2925Wn0) {
        if (!str.equals("fetch_website_actions") || !AbstractC6072hq.b()) {
            if (!"onboarding".equals(str) && !"onboarding_and_start".equals(str)) {
                return false;
            }
            final ?? r7 = new Callback() { // from class: Np
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("success", ((Boolean) obj).booleanValue());
                    c2925Wn0.onResult(bundle2);
                }
            };
            if (!AbstractC6072hq.a(true)) {
                r7.onResult(Boolean.FALSE);
            } else {
                final String string = bundle.getString("experiment_ids", "");
                bundle.remove("experiment_ids");
                c(new Callback(r7, str, string, bundle) { // from class: Op
                    public final /* synthetic */ Callback g;

                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        X5.a(obj);
                        C2414Sp.this.getClass();
                        this.g.onResult(Boolean.FALSE);
                    }
                }, true);
            }
            return true;
        }
        final ?? r12 = new Callback() { // from class: Pp
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("success", ((Boolean) obj).booleanValue());
                c2925Wn0.onResult(bundle2);
            }
        };
        if (!AbstractC6072hq.a(true)) {
            r12.onResult(Boolean.FALSE);
        } else if (!AbstractC6072hq.b()) {
            r12.onResult(Boolean.FALSE);
        } else {
            final String string2 = bundle.getString("user_name", "");
            bundle.remove("user_name");
            final String string3 = bundle.getString("experiment_ids", "");
            bundle.remove("experiment_ids");
            c(new Callback(bundle, string2, string3, r12) { // from class: Qp
                public final /* synthetic */ Callback a;

                {
                    this.a = r12;
                }

                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    X5.a(obj);
                    this.a.onResult(Boolean.FALSE);
                }
            }, false);
        }
        return true;
    }
}
