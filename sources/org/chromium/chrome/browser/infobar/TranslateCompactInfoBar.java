package org.chromium.chrome.browser.infobar;

import J.N;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.android.chrome.R;
import com.google.android.material.tabs.TabLayout;
import defpackage.AbstractC10957w33;
import defpackage.AbstractC1329Kf3;
import defpackage.C0249Bx3;
import defpackage.C12188zf3;
import defpackage.C7432ln3;
import defpackage.EI2;
import defpackage.InterfaceC0079Ap3;
import defpackage.InterfaceC11609xx3;
import defpackage.InterfaceC8184ny2;
import defpackage.JW3;
import defpackage.KW3;
import defpackage.LW3;
import defpackage.MW3;
import defpackage.PW3;
import defpackage.QW3;
import defpackage.RW3;
import defpackage.ViewOnClickListenerC1069If3;
import defpackage.ViewOnClickListenerC7418ll1;
import defpackage.YW3;
import defpackage.ZN3;
import defpackage.ZW3;
import java.util.ArrayList;
import java.util.HashMap;
import org.chromium.chrome.browser.infobar.TranslateCompactInfoBar;
import org.chromium.chrome.browser.preferences.PrefChangeRegistrar;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.infobars.InfoBar;
import org.chromium.components.translate.TranslateTabContent;
import org.chromium.components.translate.TranslateTabLayout;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class TranslateCompactInfoBar extends InfoBar implements InterfaceC11609xx3, QW3, InterfaceC8184ny2 {
    public boolean A;
    public boolean B;
    public boolean C;
    public final PrefChangeRegistrar D;
    public final int p;
    public final int q;
    public final ZW3 r;
    public long s;
    public TranslateTabLayout t;
    public RW3 u;
    public RW3 v;
    public ImageButton w;
    public ViewOnClickListenerC7418ll1 x;
    public final WindowAndroid y;
    public MW3 z;

    @Override // defpackage.InterfaceC11266wx3
    public final void b(C0249Bx3 c0249Bx3) {
    }

    @Override // defpackage.InterfaceC11266wx3
    public final void g(C0249Bx3 c0249Bx3) {
    }

    @Override // org.chromium.components.infobars.InfoBar
    public final boolean t() {
        return true;
    }

    public static void y(int i) {
        EI2.h(i, 25, "Translate.CompactInfobar.Event");
    }

    @Override // org.chromium.components.infobars.InfoBar
    public final void l(ViewOnClickListenerC7418ll1 viewOnClickListenerC7418ll1) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.l).inflate(R.layout.f58120_resource_name_obfuscated_res_0x7f0e013e, (ViewGroup) viewOnClickListenerC7418ll1, false);
        linearLayout.addOnAttachStateChangeListener(new JW3(this));
        TranslateTabLayout translateTabLayout = (TranslateTabLayout) linearLayout.findViewById(R.id.translate_infobar_tabs);
        this.t = translateTabLayout;
        if (this.q > 0) {
            int g = AbstractC10957w33.g(R.attr.f5130_resource_name_obfuscated_res_0x7f05012e, this.l);
            int g2 = AbstractC10957w33.g(R.attr.f5250_resource_name_obfuscated_res_0x7f05013a, this.l);
            translateTabLayout.getClass();
            ColorStateList i = TabLayout.i(g, g2);
            if (translateTabLayout.n != i) {
                translateTabLayout.n = i;
                ArrayList arrayList = translateTabLayout.a;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((C0249Bx3) arrayList.get(i2)).e();
                }
            }
        }
        TranslateTabLayout translateTabLayout2 = this.t;
        ZW3 zw3 = this.r;
        CharSequence[] charSequenceArr = {zw3.c(), zw3.a(zw3.b)};
        translateTabLayout2.getClass();
        for (int i3 = 0; i3 < 2; i3++) {
            CharSequence charSequence = charSequenceArr[i3];
            C7432ln3 c = C7432ln3.c();
            try {
                TranslateTabContent translateTabContent = (TranslateTabContent) LayoutInflater.from(translateTabLayout2.getContext()).inflate(R.layout.f58130_resource_name_obfuscated_res_0x7f0e013f, (ViewGroup) translateTabLayout2, false);
                c.close();
                translateTabContent.a.setTextColor(translateTabLayout2.n);
                translateTabContent.a.setText(charSequence);
                C0249Bx3 m = translateTabLayout2.m();
                m.f = translateTabContent;
                m.e();
                m.c(charSequence);
                translateTabLayout2.c(m);
            } catch (Throwable th) {
                try {
                    c.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        }
        int i4 = this.p;
        if (i4 == 1) {
            this.t.k(1).b();
            this.t.x();
            if (zw3.g) {
                this.C = true;
            }
        } else if (i4 == 2) {
            this.t.k(1).b();
        }
        this.t.b(this);
        this.t.addOnLayoutChangeListener(new KW3(this));
        ImageButton imageButton = (ImageButton) linearLayout.findViewById(R.id.translate_infobar_menu_button);
        this.w = imageButton;
        imageButton.setOnClickListener(new LW3(this));
        viewOnClickListenerC7418ll1.a(linearLayout);
        this.x = viewOnClickListenerC7418ll1;
    }

    @Override // org.chromium.components.infobars.InfoBar
    public final CharSequence o(CharSequence charSequence) {
        return this.l.getString(R.string.f89410_resource_name_obfuscated_res_0x7f140b51);
    }

    public final void setAutoAlwaysTranslate() {
        Context context = this.l;
        ZW3 zw3 = this.r;
        v(18, 3, context.getString(R.string.f89480_resource_name_obfuscated_res_0x7f140b5a, zw3.c(), zw3.a(zw3.b)));
    }

    public static InfoBar create(Tab tab, int i, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, String[] strArr, String[] strArr2, int[] iArr, String[] strArr3, int i2) {
        y(0);
        return new TranslateCompactInfoBar(tab.m(), i, str, str2, z, z2, z3, z4, strArr, strArr2, iArr, strArr3, i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TranslateCompactInfoBar(WindowAndroid windowAndroid, int i, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, String[] strArr, String[] strArr2, int[] iArr, String[] strArr3, int i2) {
        super(R.drawable.f50960_resource_name_obfuscated_res_0x7f090364, 0, null, null);
        this.B = true;
        this.y = windowAndroid;
        if (N.MI_WWqtz("ContentLanguagesInLanguagePicker") && !N.MV96drCk("ContentLanguagesInLanguagePicker", "disable_observers", false)) {
            PrefChangeRegistrar prefChangeRegistrar = new PrefChangeRegistrar();
            this.D = prefChangeRegistrar;
            prefChangeRegistrar.a("intl.accept_languages", this);
        } else {
            this.D = null;
        }
        this.p = i;
        this.q = i2;
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < strArr.length; i3++) {
            arrayList.add(new YW3(strArr2[i3], strArr[i3], iArr != null ? Integer.valueOf(iArr[i3]) : null));
        }
        this.r = new ZW3(str, str2, arrayList, strArr3, z, z2, z3, z4);
    }

    @Override // defpackage.InterfaceC8184ny2
    public final void c() {
        long j = this.s;
        if (j != 0) {
            String[] M4cX9AMK = N.M4cX9AMK(j, this);
            this.r.d = M4cX9AMK;
            RW3 rw3 = this.v;
            if (rw3 != null) {
                rw3.g.d = M4cX9AMK;
                PW3 pw3 = rw3.j;
                int i = PW3.i;
                pw3.clear();
                pw3.g = 1;
                pw3.addAll(RW3.a(pw3.h, 1));
                pw3.notifyDataSetChanged();
            }
        }
    }

    public void onTargetLanguageChanged(String str) {
        ZW3 zw3 = this.r;
        boolean z = zw3.b(zw3.a) && zw3.b(str);
        if (z) {
            zw3.b = str;
        }
        if (z) {
            TranslateTabLayout translateTabLayout = this.t;
            String a = zw3.a(str);
            if (1 >= translateTabLayout.l()) {
                return;
            }
            C0249Bx3 k = translateTabLayout.k(1);
            ((TranslateTabContent) k.f).a.setText(a);
            k.c(a);
        }
    }

    public final void u(boolean z) {
        if (this.m) {
            return;
        }
        if (!this.C) {
            y(2);
        }
        if (z) {
            long j = this.s;
            if (j != 0 && N.MX8X$p3M(j, this, this.A)) {
                v(19, 4, this.l.getString(R.string.f89500_resource_name_obfuscated_res_0x7f140b5c, this.r.c()));
                return;
            }
        }
        super.i();
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [IW3] */
    public final void x(int i) {
        boolean MM0pw8sM = N.MM0pw8sM(this.s, this);
        boolean equals = this.r.a.equals("und");
        ?? r9 = new InterfaceC0079Ap3() { // from class: IW3
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                TranslateCompactInfoBar translateCompactInfoBar = TranslateCompactInfoBar.this;
                View findViewById = translateCompactInfoBar.k.getRootView().findViewById(R.id.coordinator);
                if (!findViewById.isAttachedToWindow() || (((Activity) translateCompactInfoBar.l).getWindow().getAttributes().flags & 512) == 0) {
                    return null;
                }
                int[] iArr = new int[2];
                findViewById.getLocationInWindow(iArr);
                Rect rect = new Rect(0, 0, findViewById.getWidth(), findViewById.getHeight());
                rect.offsetTo(iArr[0], iArr[1] - ((ViewGroup.MarginLayoutParams) findViewById.getLayoutParams()).topMargin);
                return rect;
            }
        };
        if (i == 0) {
            this.u = new RW3(this.l, this.w, this.r, this, MM0pw8sM, equals, r9);
        } else if ((i == 1 || i == 2) && this.v == null) {
            this.v = new RW3(this.l, this.w, this.r, this, MM0pw8sM, equals, r9);
        }
    }

    public final void onTranslating() {
        TranslateTabLayout translateTabLayout = this.t;
        if (translateTabLayout != null) {
            if (translateTabLayout != null) {
                translateTabLayout.f11501J.remove(this);
                this.t.k(1).b();
                this.t.b(this);
            }
            this.t.x();
        }
    }

    public final boolean onPageTranslated(int i) {
        TranslateTabLayout translateTabLayout = this.t;
        if (translateTabLayout == null) {
            return false;
        }
        C0249Bx3 c0249Bx3 = translateTabLayout.U;
        if (c0249Bx3 != null) {
            View view = c0249Bx3.f;
            if (view instanceof TranslateTabContent) {
                TranslateTabContent translateTabContent = (TranslateTabContent) view;
                translateTabContent.g.setVisibility(4);
                translateTabContent.a.setVisibility(0);
            }
            translateTabLayout.U = null;
        }
        if (i == 0) {
            return false;
        }
        ZN3 b = ZN3.b(R.string.f89420_resource_name_obfuscated_res_0x7f140b54, 0, this.l);
        int[] iArr = new int[2];
        this.t.getLocationOnScreen(iArr);
        b.a.setGravity(49, 0, (iArr[1] - this.t.getHeight()) - this.l.getResources().getDimensionPixelSize(R.dimen.f42660_resource_name_obfuscated_res_0x7f080827));
        b.d();
        TranslateTabLayout translateTabLayout2 = this.t;
        if (translateTabLayout2 != null) {
            translateTabLayout2.f11501J.remove(this);
            this.t.k(0).b();
            this.t.b(this);
        }
        return true;
    }

    public final void setNativePtr(long j) {
        this.s = j;
    }

    @Override // org.chromium.components.infobars.InfoBar
    public final void resetNativeInfoBar() {
        this.s = 0L;
        super.resetNativeInfoBar();
    }

    @Override // org.chromium.components.infobars.InfoBar, defpackage.InterfaceC1487Ll1
    public final void i() {
        PrefChangeRegistrar prefChangeRegistrar = this.D;
        if (prefChangeRegistrar != null) {
            prefChangeRegistrar.b();
        }
        ObjectAnimator objectAnimator = this.t.V;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
        u(true);
    }

    @Override // org.chromium.components.infobars.InfoBar
    public final void s() {
        RW3 rw3 = this.u;
        if (rw3 != null) {
            rw3.b();
        }
        RW3 rw32 = this.v;
        if (rw32 != null) {
            rw32.b();
        }
        WindowAndroid windowAndroid = this.y;
        if (AbstractC1329Kf3.a(windowAndroid) == null || this.z == null) {
            return;
        }
        AbstractC1329Kf3.a(windowAndroid).a(this.z);
    }

    public final void v(int i, int i2, String str) {
        WindowAndroid windowAndroid = this.y;
        if (AbstractC1329Kf3.a(windowAndroid) == null) {
            w(i2);
            return;
        }
        if (i2 == 0) {
            y(13);
        } else if (i2 == 1) {
            y(15);
        } else if (i2 == 2) {
            y(14);
        } else if (i2 == 3) {
            y(21);
        } else if (i2 == 4) {
            y(22);
        }
        this.z = new MW3(this, i2);
        ViewOnClickListenerC1069If3 a = AbstractC1329Kf3.a(windowAndroid);
        C12188zf3 a2 = C12188zf3.a(str, this.z, 1, i);
        a2.i = false;
        a2.d = this.l.getString(R.string.f89490_resource_name_obfuscated_res_0x7f140b5b);
        a2.e = null;
        a.c(a2);
    }

    public final void w(int i) {
        long j = this.s;
        if (j == 0) {
            return;
        }
        ZW3 zw3 = this.r;
        if (i == 0) {
            this.C = true;
            zw3.d(!zw3.h[2]);
            N.MIY$H5s3(this.s, this, 2, zw3.h[2]);
            if (zw3.h[2] && this.t.j() == 0) {
                this.C = true;
                r(3);
                return;
            }
            return;
        }
        if (i == 1) {
            boolean[] zArr = zw3.h;
            boolean z = !zArr[1];
            zArr[1] = z;
            this.C = true;
            N.MIY$H5s3(j, this, 4, z);
            return;
        }
        if (i == 2) {
            this.C = true;
        } else if (i == 3) {
            zw3.d(!zw3.h[2]);
            N.MIY$H5s3(this.s, this, 2, zw3.h[2]);
            return;
        } else if (i != 4) {
            return;
        }
        boolean[] zArr2 = zw3.h;
        boolean z2 = !zArr2[0];
        if (zArr2[2] && z2) {
            zw3.d(false);
        }
        zArr2[0] = z2;
        N.MIY$H5s3(this.s, this, 3, zw3.h[0]);
    }

    public final void z(String str, String str2) {
        ZW3 zw3 = this.r;
        zw3.getClass();
        boolean isEmpty = TextUtils.isEmpty(str2);
        HashMap hashMap = zw3.f;
        Integer num = !isEmpty && hashMap.containsKey(str2) ? (Integer) hashMap.get(str2) : null;
        if (num != null) {
            EI2.m(num.intValue(), str);
        }
    }

    @Override // defpackage.InterfaceC11266wx3
    public final void k(C0249Bx3 c0249Bx3) {
        int i = c0249Bx3.e;
        if (i == 0) {
            y(12);
            this.C = true;
            r(4);
        } else {
            if (i != 1) {
                return;
            }
            y(1);
            z("Translate.CompactInfobar.Language.Translate", this.r.b);
            this.C = true;
            r(3);
        }
    }
}
