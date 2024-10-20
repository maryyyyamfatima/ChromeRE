package defpackage;

import J.N;
import android.widget.TextView;
import org.chromium.ui.base.LocalizationUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public final class C51 {
    public final InterfaceC11344xB0 a;

    public C51(InterfaceC11344xB0 interfaceC11344xB0) {
        this.a = interfaceC11344xB0;
    }

    public final C3443aA2 a(TextView textView) {
        C8066ne3 c8066ne3;
        float x = textView.getX() + (textView.getWidth() / 2.0f);
        BK3 bk3 = (BK3) this.a;
        synchronized (bk3.g) {
            c8066ne3 = bk3.f;
        }
        float y = c8066ne3.b - (textView.getY() + (textView.getHeight() / 2.0f));
        float width = (textView.getWidth() - (textView.getPaddingLeft() * 2.0f)) + (textView.getShadowDx() * 2.0f);
        float height = (textView.getHeight() - (textView.getPaddingTop() * 2.0f)) + (textView.getShadowDy() * 2.0f);
        C3377Zz2 c3377Zz2 = (C3377Zz2) C3443aA2.o.j();
        C2857Vz2 c2857Vz2 = (C2857Vz2) C2987Wz2.m.j();
        if (c2857Vz2.h) {
            c2857Vz2.l();
            c2857Vz2.h = false;
        }
        C2987Wz2 c2987Wz2 = (C2987Wz2) c2857Vz2.g;
        c2987Wz2.j |= 1;
        c2987Wz2.k = x;
        if (c2857Vz2.h) {
            c2857Vz2.l();
            c2857Vz2.h = false;
        }
        C2987Wz2 c2987Wz22 = (C2987Wz2) c2857Vz2.g;
        c2987Wz22.j |= 2;
        c2987Wz22.l = y;
        if (c3377Zz2.h) {
            c3377Zz2.l();
            c3377Zz2.h = false;
        }
        C3443aA2 c3443aA2 = (C3443aA2) c3377Zz2.g;
        C2987Wz2 c2987Wz23 = (C2987Wz2) c2857Vz2.j();
        c3443aA2.getClass();
        c2987Wz23.getClass();
        c3443aA2.k = c2987Wz23;
        c3443aA2.j |= 1;
        if (c3377Zz2.h) {
            c3377Zz2.l();
            c3377Zz2.h = false;
        }
        C3443aA2 c3443aA22 = (C3443aA2) c3377Zz2.g;
        c3443aA22.j |= 2;
        c3443aA22.l = width;
        if (c3377Zz2.h) {
            c3377Zz2.l();
            c3377Zz2.h = false;
        }
        C3443aA2 c3443aA23 = (C3443aA2) c3377Zz2.g;
        c3443aA23.j |= 4;
        c3443aA23.m = height;
        float radians = (float) Math.toRadians(-textView.getRotation());
        if (c3377Zz2.h) {
            c3377Zz2.l();
            c3377Zz2.h = false;
        }
        C3443aA2 c3443aA24 = (C3443aA2) c3377Zz2.g;
        c3443aA24.j |= 8;
        c3443aA24.n = radians;
        return (C3443aA2) c3377Zz2.j();
    }

    public static C7269lJ3 b(TextView textView) {
        float width = (textView.getWidth() - (textView.getPaddingLeft() * 2.0f)) + (textView.getShadowDx() * 2.0f);
        C6925kJ3 c6925kJ3 = (C6925kJ3) C7269lJ3.q.j();
        String charSequence = textView.getText().toString();
        if (c6925kJ3.h) {
            c6925kJ3.l();
            c6925kJ3.h = false;
        }
        C7269lJ3 c7269lJ3 = (C7269lJ3) c6925kJ3.g;
        c7269lJ3.getClass();
        charSequence.getClass();
        c7269lJ3.j |= 1;
        c7269lJ3.k = charSequence;
        float textSize = textView.getTextSize() / width;
        if (c6925kJ3.h) {
            c6925kJ3.l();
            c6925kJ3.h = false;
        }
        C7269lJ3 c7269lJ32 = (C7269lJ3) c6925kJ3.g;
        c7269lJ32.j |= 4;
        c7269lJ32.m = textSize;
        int i = LocalizationUtils.isLayoutRtl() ? 4 : 2;
        if (c6925kJ3.h) {
            c6925kJ3.l();
            c6925kJ3.h = false;
        }
        C7269lJ3 c7269lJ33 = (C7269lJ3) c6925kJ3.g;
        c7269lJ33.getClass();
        c7269lJ33.o = AbstractC2373Sg3.b(i);
        c7269lJ33.j |= 16;
        int defaultColor = textView.getTextColors().getDefaultColor();
        int i2 = ((defaultColor >>> 24) & 255) | ((defaultColor << 8) & (-256));
        if (c6925kJ3.h) {
            c6925kJ3.l();
            c6925kJ3.h = false;
        }
        C7269lJ3 c7269lJ34 = (C7269lJ3) c6925kJ3.g;
        c7269lJ34.j |= 8;
        c7269lJ34.n = i2;
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("ScreenshotsForAndroidV2")) {
            C4520dJ3 c4520dJ3 = (C4520dJ3) C4863eJ3.o.j();
            if (c4520dJ3.h) {
                c4520dJ3.l();
                c4520dJ3.h = false;
            }
            C4863eJ3 c4863eJ3 = (C4863eJ3) c4520dJ3.g;
            c4863eJ3.j |= 1;
            c4863eJ3.k = 707406591;
            float shadowRadius = textView.getShadowRadius() / width;
            if (c4520dJ3.h) {
                c4520dJ3.l();
                c4520dJ3.h = false;
            }
            C4863eJ3 c4863eJ32 = (C4863eJ3) c4520dJ3.g;
            c4863eJ32.j = 2 | c4863eJ32.j;
            c4863eJ32.l = shadowRadius;
            float shadowDx = textView.getShadowDx() / width;
            if (c4520dJ3.h) {
                c4520dJ3.l();
                c4520dJ3.h = false;
            }
            C4863eJ3 c4863eJ33 = (C4863eJ3) c4520dJ3.g;
            c4863eJ33.j = 4 | c4863eJ33.j;
            c4863eJ33.m = shadowDx;
            float shadowDy = textView.getShadowDy() / width;
            if (c4520dJ3.h) {
                c4520dJ3.l();
                c4520dJ3.h = false;
            }
            C4863eJ3 c4863eJ34 = (C4863eJ3) c4520dJ3.g;
            c4863eJ34.j |= 8;
            c4863eJ34.n = shadowDy;
            if (c6925kJ3.h) {
                c6925kJ3.l();
                c6925kJ3.h = false;
            }
            C7269lJ3 c7269lJ35 = (C7269lJ3) c6925kJ3.g;
            C4863eJ3 c4863eJ35 = (C4863eJ3) c4520dJ3.j();
            c7269lJ35.getClass();
            c4863eJ35.getClass();
            c7269lJ35.p = c4863eJ35;
            c7269lJ35.j |= 32;
        }
        return (C7269lJ3) c6925kJ3.j();
    }
}
