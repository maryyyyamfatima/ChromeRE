package defpackage;

import J.N;
import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.android.chrome.R;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.chromium.chrome.browser.contextualsearch.ContextualSearchManager;
import org.chromium.ui.base.LocalizationUtils;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uf2 */
/* loaded from: classes.dex */
public abstract class AbstractC10472uf2 {
    public final float A;
    public final float B;
    public final float C;
    public boolean D;
    public final float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float K;
    public boolean L;
    public final float M;
    public float N;
    public ViewGroup O;
    public C9537rv0 P;
    public Integer Q;
    public int R;
    public C4424d20 S;
    public final InterfaceC2201Qy1 T;
    public final float a;
    public final float g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public float m;
    public final Context n;
    public final int p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public boolean y;
    public int o = 0;
    public final C8385oa2 z = new C8385oa2();

    /* renamed from: J */
    public float f11546J = 1.0f;

    public abstract void F0(float f);

    public final void R() {
    }

    public abstract void j0(int i, boolean z);

    public abstract void w0(Integer num, int i, long j);

    public final V10 z0() {
        return ((C9897sy1) this.T).H;
    }

    public AbstractC10472uf2(Activity activity, InterfaceC2201Qy1 interfaceC2201Qy1, float f) {
        this.n = activity;
        this.g = f;
        float f2 = 1.0f / activity.getResources().getDisplayMetrics().density;
        this.a = f2;
        this.A = 12.0f;
        this.B = 10.0f;
        this.M = 2.0f;
        this.E = 1.0f;
        this.C = activity.getResources().getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f08063b) * f2;
        Resources resources = activity.getResources();
        this.h = AbstractC10957w33.a(activity);
        this.i = AbstractC10957w33.c(activity);
        this.j = AbstractC10957w33.f(activity);
        this.k = AbstractC10957w33.b(activity);
        this.l = AbstractC10957w33.b(activity);
        this.p = (int) (resources.getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f08063c) * f2);
        this.T = interfaceC2201Qy1;
    }

    public final void v0(int i, Integer num) {
        w0(num, i, 218L);
    }

    public final boolean a() {
        return this.x > 0.0f;
    }

    public final boolean x() {
        return this.x > ((N70) this).R0();
    }

    public final boolean D0() {
        return this.q <= 680.0f;
    }

    public final void E0() {
        InterfaceC2201Qy1 interfaceC2201Qy1 = this.T;
        if (interfaceC2201Qy1 != null) {
            ((C9897sy1) interfaceC2201Qy1).N(null);
        }
    }

    public final float B0() {
        if (this.H == 0.0f) {
            this.H = AbstractC9771sd.c(this.n.getResources(), R.drawable.0_resource_name_obfuscated_res_0x7f0903f4, 0).getIntrinsicWidth() * this.a;
        }
        return this.H;
    }

    public final int v() {
        return this.o;
    }

    public final boolean x0(int i) {
        return i == this.o && JM1.a(this.x, C0(Integer.valueOf(i)));
    }

    public final float C0(Integer num) {
        if (num == null) {
            return 0.0f;
        }
        if (num.intValue() == 2) {
            return ((N70) this).R0();
        }
        if (num.intValue() == 3) {
            return A0();
        }
        if (num.intValue() == 4) {
            return 0.95f * ((N70) this).r;
        }
        return 0.0f;
    }

    public final float A0() {
        float f;
        if (D0()) {
            f = this.r;
        } else {
            f = this.r - (this.g * this.a);
        }
        return f * 0.7f;
    }

    public final int y0(float f) {
        int i;
        if (f < 0.0f) {
            return 1;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i2 >= 5) {
                i2 = i3;
                i = i4;
                break;
            }
            if (i2 != 0) {
                if (f >= C0(Integer.valueOf(i3)) && f < C0(Integer.valueOf(i2))) {
                    i = i3;
                    break;
                }
                i4 = i3;
                i3 = i2;
            }
            i2++;
        }
        float C0 = C0(Integer.valueOf(i));
        return (f - C0) / (C0(Integer.valueOf(i2)) - C0) > 0.5f ? i2 : i;
    }

    public final void G0(float f) {
        float round;
        FO2 fo2;
        int i = 0;
        while (true) {
            if (i >= 5) {
                i = 1;
                break;
            }
            if ((i != 0) && f <= C0(Integer.valueOf(i))) {
                break;
            } else {
                i++;
            }
        }
        Integer valueOf = (i < 2 || i > 4) ? null : Integer.valueOf(i - 1);
        float C0 = C0(Integer.valueOf(valueOf != null ? valueOf.intValue() : 0));
        float C02 = C0(Integer.valueOf(i));
        float f2 = (C0 == 0.0f && C02 == 0.0f) ? 0.0f : (f - C0) / (C02 - C0);
        this.x = f;
        if (D0()) {
            round = 0.0f;
        } else {
            round = Math.round((this.q - (D0() ? this.q : 600.0f)) / 2.0f);
        }
        this.v = round;
        this.w = this.r - this.x;
        this.y = f == C0(4);
        this.z.p(Boolean.valueOf(a()));
        if (i == 1 || i == 2) {
            N70 n70 = (N70) this;
            n70.I = 0.0f;
            n70.f11546J = 1.0f;
            n70.D = false;
            n70.F = 0.0f;
            n70.K = 0.0f;
            C4116c80 T0 = n70.T0();
            if (T0.u) {
                T0.n(1.0f);
                T0.m();
            }
            C3503aM2 U0 = n70.U0();
            boolean z = U0.l;
            if (z) {
                if (z) {
                    float f3 = U0.n;
                    U0.m = Math.round(JM1.b(f3 * 1.0f, 0.0f, f3));
                } else {
                    U0.m = 0.0f;
                }
                if (U0.r) {
                    U0.h(true);
                } else {
                    U0.f();
                }
            }
            C3503aM2 V0 = n70.V0();
            boolean z2 = V0.l;
            if (z2) {
                if (z2) {
                    float f4 = V0.n;
                    V0.m = Math.round(JM1.b(f4 * 1.0f, 0.0f, f4));
                } else {
                    V0.m = 0.0f;
                }
                if (V0.r) {
                    V0.h(true);
                } else {
                    V0.f();
                }
            }
            C5829h70 b0 = n70.b0();
            if (f2 == 1.0f) {
                b0.g.c(3, 0.0f);
                b0.d.n(0.0f);
                C7553m80 c7553m80 = b0.c;
                c7553m80.getClass();
                c7553m80.w = false;
                c7553m80.l(false);
                C7203l70 c7203l70 = b0.b;
                c7203l70.getClass();
                c7203l70.w = false;
                c7203l70.l(false);
            }
            if (f2 == 0.0f) {
                b0.e.n();
                b0.g.b(false);
            } else {
                b0.getClass();
            }
            n70.y0 = false;
        } else if (i == 3) {
            N70 n702 = (N70) this;
            n702.I = AbstractC2277Rn2.a(n702.m, 0.0f, f2, 0.0f);
            n702.f11546J = ((-0.3f) * f2) + 1.0f;
            n702.D = true;
            Math.min(f2, 0.5f);
            n702.F = ((Math.max(f2 - 0.5f, 0.0f) / 0.5f) * 1.0f) + 0.0f;
            float C03 = n702.C0(2);
            float f5 = 10.0f / n702.a;
            n702.K = ((Math.min(n702.x - C03, f5) / f5) * 1.0f) + 0.0f;
            if (n702.o == 3 && !n702.y0 && f2 < 0.5f) {
                n702.y0 = true;
                ContextualSearchManager contextualSearchManager = (ContextualSearchManager) n702.s0;
                if (contextualSearchManager.O && (fo2 = contextualSearchManager.P) != null) {
                    contextualSearchManager.e(fo2, fo2.a, false);
                }
                n702.U0().b();
                n702.V0().b();
            }
            C4116c80 T02 = n702.T0();
            if (T02.u) {
                T02.n(1.0f);
                if (f2 == 1.0f) {
                    float b = T02.r.b();
                    View view = T02.l;
                    if (view != null && T02.u && ((!T02.y || T02.z != b) && T02.w != 0.0f)) {
                        float f6 = T02.q.v * T02.s;
                        if (LocalizationUtils.isLayoutRtl()) {
                            f6 = -f6;
                        }
                        view.setTranslationX(f6);
                        view.setTranslationY(b);
                        view.setVisibility(0);
                        view.requestLayout();
                        T02.y = true;
                        T02.z = b;
                        int b2 = S70.a().b("search.contextual_search_promo_card_shown_count") + 1;
                        N.MPBZLcVx(S70.a().a, "search.contextual_search_promo_card_shown_count", b2);
                        Pattern pattern = AbstractC8584p80.a;
                        EI2.e(b2, "Search.ContextualSearchPromoOpenCount2");
                        float f7 = T02.x;
                        T02.x = T02.l.getMeasuredHeight();
                        if (T02.u) {
                            T02.w = Math.round((T02.w / f7) * r8);
                        }
                    }
                } else {
                    T02.m();
                }
            }
            n702.U0().i(f2);
            n702.V0().i(f2);
            C5829h70 b02 = n702.b0();
            b02.g.c(3, f2);
            b02.d.n(f2);
            C7553m80 c7553m802 = b02.c;
            c7553m802.getClass();
            c7553m802.w = f2 > 0.5f;
            c7553m802.l(false);
            C7203l70 c7203l702 = b02.b;
            c7203l702.getClass();
            c7203l702.w = f2 > 0.5f;
            c7203l702.l(false);
        } else if (i == 4) {
            N70 n703 = (N70) this;
            n703.I = n703.m;
            n703.f11546J = ((-0.29999998f) * f2) + 0.7f;
            n703.D = true;
            n703.F = 1.0f;
            n703.K = 1.0f;
            C4116c80 T03 = n703.T0();
            if (T03.u) {
                T03.n(1.0f - f2);
                T03.m();
            }
            n703.U0().i(f2);
            n703.V0().i(f2);
            C5829h70 b03 = n703.b0();
            b03.g.c(4, f2);
            C6515j70 c6515j70 = b03.d;
            ((ContextualSearchManager) c6515j70.B.s0).t.getClass();
            if (S70.d() && c6515j70.A) {
                C4424d20 c4424d20 = c6515j70.E;
                if (c4424d20 != null) {
                    c4424d20.cancel();
                }
                c6515j70.D = 1.0f - f2;
            }
        }
        N70 n704 = (N70) this;
        float f8 = (1.0f - n704.f11546J) / 0.6f;
        if (f8 == 0.0d) {
            OX2 ox2 = n704.v0;
            if (ox2 != null) {
                ox2.a(false);
            }
            n704.w0 = null;
            n704.v0 = null;
            return;
        }
        n704.v0 = ((ContextualSearchManager) n704.s0).m;
        if (n704.w0 == null) {
            HashMap e = PropertyModel.e(UX2.l);
            ID2 id2 = UX2.a;
            DD2 dd2 = new DD2();
            dd2.a = 0;
            e.put(id2, dd2);
            HD2 hd2 = UX2.b;
            AD2 ad2 = new AD2();
            ad2.a = true;
            e.put(hd2, ad2);
            JD2 jd2 = UX2.c;
            GD2 gd2 = new GD2();
            gd2.a = n704.l0;
            e.put(jd2, gd2);
            HD2 hd22 = UX2.d;
            AD2 ad22 = new AD2();
            ad22.a = false;
            e.put(hd22, ad22);
            JD2 jd22 = UX2.e;
            GD2 gd22 = new GD2();
            gd22.a = null;
            e.put(jd22, gd22);
            JD2 jd23 = UX2.f;
            GD2 gd23 = new GD2();
            gd23.a = null;
            e.put(jd23, gd23);
            PropertyModel propertyModel = new PropertyModel(e);
            n704.w0 = propertyModel;
            n704.v0.b(propertyModel);
        }
        TX2 tx2 = n704.v0.b;
        Animator animator = tx2.e;
        if (animator != null) {
            animator.cancel();
        }
        tx2.b(f8);
    }

    public final void H0() {
        float f;
        float f2 = 0.0f;
        if (D0()) {
            N70 n70 = (N70) this;
            float f3 = n70.z0;
            if (f3 > 0.0f) {
                float f4 = n70.a;
                f = (n70.s * f4) + ((n70.r - n70.A0()) / 2.0f) + (-(f3 * f4));
            } else {
                f = 0.0f;
            }
            f2 = Math.max(Math.min(f - (this.s * this.a), 0.0f), -A0());
        }
        this.m = f2;
    }
}
