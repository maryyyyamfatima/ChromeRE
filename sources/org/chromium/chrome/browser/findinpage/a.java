package org.chromium.chrome.browser.findinpage;

import J.N;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AbstractC10957w33;
import defpackage.AbstractC11276wz3;
import defpackage.C8385oa2;
import defpackage.IN0;
import defpackage.InterfaceC10590uz3;
import defpackage.InterfaceC3855bO0;
import defpackage.InterfaceC7458ls;
import defpackage.InterfaceC7697ma2;
import defpackage.InterpolatorC0485Dt;
import defpackage.LN0;
import defpackage.NN0;
import defpackage.ON0;
import defpackage.PN0;
import defpackage.QN0;
import defpackage.RN0;
import defpackage.SN0;
import defpackage.TN0;
import defpackage.UN0;
import defpackage.VN0;
import defpackage.WN0;
import defpackage.XN0;
import defpackage.YN0;
import java.util.Iterator;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.ui.base.LocalizationUtils;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class a extends LinearLayout implements InterfaceC7458ls {
    public PN0 A;
    public boolean B;
    public final C8385oa2 C;
    public boolean D;
    public TextView a;
    public FindToolbar$FindQuery g;
    public ImageButton h;
    public ImageButton i;
    public ImageButton j;
    public View k;
    public NN0 l;
    public InterfaceC10590uz3 m;
    public final RN0 n;
    public final SN0 o;
    public Tab p;
    public final QN0 q;
    public WindowAndroid r;
    public IN0 s;
    public InterfaceC3855bO0 t;
    public String u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public final Handler z;

    public void e(Rect rect) {
    }

    public void x(boolean z) {
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.u = "";
        this.x = 2;
        this.y = 2;
        this.z = new Handler();
        this.C = new C8385oa2();
        this.q = new QN0(this);
        this.n = new RN0(this);
        this.o = new SN0(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setOrientation(0);
        setGravity(16);
        FindToolbar$FindQuery findToolbar$FindQuery = (FindToolbar$FindQuery) findViewById(R.id.find_query);
        this.g = findToolbar$FindQuery;
        findToolbar$FindQuery.l = this;
        findToolbar$FindQuery.setInputType(177);
        this.g.setSelectAllOnFocus(true);
        this.g.setOnFocusChangeListener(new TN0(this));
        this.g.addTextChangedListener(new UN0(this));
        this.g.setOnEditorActionListener(new VN0(this));
        this.a = (TextView) findViewById(R.id.find_status);
        u("", false);
        ImageButton imageButton = (ImageButton) findViewById(R.id.find_prev_button);
        this.i = imageButton;
        imageButton.setOnClickListener(new WN0(this));
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.find_next_button);
        this.j = imageButton2;
        imageButton2.setOnClickListener(new XN0(this));
        this.i.setEnabled(false);
        this.j.setEnabled(false);
        ImageButton imageButton3 = (ImageButton) findViewById(R.id.close_find_button);
        this.h = imageButton3;
        imageButton3.setOnClickListener(new YN0(this));
        this.k = findViewById(R.id.find_separator);
    }

    @Override // defpackage.InterfaceC7458ls
    public final InterfaceC7697ma2 r() {
        return this.C;
    }

    public static void a(a aVar, boolean z) {
        if (aVar.s == null) {
            return;
        }
        String obj = aVar.g.getText().toString();
        if (obj.length() == 0) {
            return;
        }
        aVar.r.r().d(aVar.g);
        IN0 in0 = aVar.s;
        N.MiKuFRTN(in0.b, in0, obj, z, false);
        IN0 in02 = aVar.s;
        N.MNC06_Rq(in02.b, in02);
        aVar.B = true;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.D) {
            this.D = false;
            this.z.postDelayed(new ON0(this), 0L);
        }
    }

    public final void b() {
        ThreadUtils.a();
        Tab h = ((AbstractC11276wz3) this.m).h();
        if ((h == null || h.b() == null || h.isNativePage()) ? false : true) {
            int i = this.x;
            if (i != 0) {
                this.y = 0;
                if (i != 2) {
                    return;
                }
                o(1);
                g();
                return;
            }
            this.g.requestFocus();
            v();
        }
    }

    public void g() {
        ((AbstractC11276wz3) this.m).c(this.n);
        Iterator it = ((AbstractC11276wz3) this.m).a.iterator();
        while (it.hasNext()) {
            ((TabModel) it.next()).g(this.o);
        }
        Tab h = ((AbstractC11276wz3) this.m).h();
        this.p = h;
        h.v(this.q);
        IN0 in0 = new IN0(this.p.b());
        this.s = in0;
        this.v = true;
        String M3t_h9OB = N.M3t_h9OB(in0.b, in0);
        if (M3t_h9OB.isEmpty() && !n()) {
            M3t_h9OB = this.u;
        }
        this.w = true;
        this.g.setText(M3t_h9OB);
        this.v = false;
        this.g.requestFocus();
        v();
        t(true);
        x(n());
        o(0);
    }

    @Override // defpackage.InterfaceC7458ls
    public final void h() {
        d(true);
    }

    public final void d(boolean z) {
        ThreadUtils.a();
        this.y = 2;
        if (this.x != 0) {
            return;
        }
        o(3);
        i(z);
    }

    public void i(boolean z) {
        t(false);
        ((AbstractC11276wz3) this.m).s(this.n);
        Iterator it = ((AbstractC11276wz3) this.m).a.iterator();
        while (it.hasNext()) {
            ((TabModel) it.next()).i(this.o);
        }
        this.p.w(this.q);
        this.r.r().d(this.g);
        if (this.g.getText().length() > 0) {
            c();
            IN0 in0 = this.s;
            N.MWOuMqhA(in0.b, in0, z);
        }
        IN0 in02 = this.s;
        N.MlPioXlo(in02.b, in02);
        in02.b = 0L;
        this.s = null;
        this.p = null;
        o(2);
    }

    public final void o(int i) {
        this.x = i;
        this.C.p(Boolean.valueOf(i == 0));
        InterfaceC3855bO0 interfaceC3855bO0 = this.t;
        if (interfaceC3855bO0 != null) {
            int i2 = this.x;
            if (i2 == 2) {
                interfaceC3855bO0.b();
            } else if (i2 == 0) {
                interfaceC3855bO0.a();
            }
        }
        int i3 = this.x;
        if (i3 == 2 && this.y == 0) {
            b();
        } else if (i3 == 0 && this.y == 2) {
            d(true);
        }
    }

    public void c() {
        u("", false);
        NN0 nn0 = this.l;
        if (nn0 != null) {
            nn0.b(-1, new RectF[0], null);
        }
    }

    public final void t(boolean z) {
        NN0 nn0;
        Tab tab;
        if (z && this.l == null && (tab = this.p) != null && tab.b() != null) {
            this.l = new NN0(getContext(), this.p.y(), this.r, this.s);
            return;
        }
        if (z || (nn0 = this.l) == null) {
            return;
        }
        nn0.A = true;
        nn0.s = null;
        ObjectAnimator objectAnimator = nn0.z;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            nn0.z.cancel();
        }
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        boolean isLayoutRtl = LocalizationUtils.isLayoutRtl();
        int i = nn0.l;
        if (isLayoutRtl) {
            i = -i;
        }
        fArr[0] = i;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(nn0, (Property<NN0, Float>) property, fArr);
        nn0.z = ofFloat;
        ofFloat.setDuration(200L);
        nn0.z.setInterpolator(InterpolatorC0485Dt.d);
        nn0.t.C(nn0.z);
        nn0.z.addListener(new LN0(nn0));
        this.l = null;
    }

    public final void u(String str, boolean z) {
        this.a.setText(str);
        this.a.setContentDescription(null);
        this.a.setTextColor(f(z, n()));
        this.a.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
    }

    public int f(boolean z, boolean z2) {
        if (!z) {
            return AbstractC10957w33.g(R.attr.0_resource_name_obfuscated_res_0x7f050132, getContext());
        }
        return getContext().getColor(R.color.0_resource_name_obfuscated_res_0x7f0701a0);
    }

    public final void v() {
        if (!this.g.hasWindowFocus()) {
            this.D = true;
        } else {
            this.r.r().i(this.g);
        }
    }

    public final boolean n() {
        InterfaceC10590uz3 interfaceC10590uz3 = this.m;
        return interfaceC10590uz3 != null && ((AbstractC11276wz3) interfaceC10590uz3).o();
    }
}
