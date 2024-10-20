package org.chromium.components.infobars;

import J.N;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.C0022Ae1;
import defpackage.C0282Ce1;
import defpackage.C0447Dl1;
import defpackage.C11814ya2;
import defpackage.InterfaceC1487Ll1;
import defpackage.InterfaceC2006Pl1;
import defpackage.InterfaceC6387il1;
import defpackage.InterfaceC9821sl1;
import defpackage.ViewOnClickListenerC1876Ol1;
import defpackage.ViewOnClickListenerC7418ll1;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.chrome.browser.infobar.InfoBarContainer;
import org.chromium.chrome.browser.infobar.NearOomInfoBar;
import org.chromium.components.browser_ui.widget.DualControlLayout;
import org.chromium.ui.widget.ChromeImageView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class InfoBar implements InterfaceC1487Ll1, InterfaceC2006Pl1 {
    public final int a;
    public final Bitmap g;
    public final int h;
    public final CharSequence i;
    public InterfaceC6387il1 j;
    public View k;
    public Context l;
    public boolean m;
    public boolean n = true;
    public long o;

    public int a() {
        return 2;
    }

    @Override // defpackage.InterfaceC1487Ll1
    public void d(boolean z) {
    }

    public void l(ViewOnClickListenerC7418ll1 viewOnClickListenerC7418ll1) {
    }

    public void m(ViewOnClickListenerC1876Ol1 viewOnClickListenerC1876Ol1) {
    }

    public CharSequence o(CharSequence charSequence) {
        return charSequence == null ? "" : charSequence;
    }

    public void s() {
    }

    public boolean t() {
        return this instanceof NearOomInfoBar;
    }

    public InfoBar(int i, int i2, CharSequence charSequence, Bitmap bitmap) {
        this.a = i;
        this.g = bitmap;
        this.h = i2;
        this.i = charSequence;
    }

    public final void setNativeInfoBar(long j) {
        this.o = j;
    }

    public void resetNativeInfoBar() {
        this.o = 0L;
    }

    public final View n() {
        if (t()) {
            ViewOnClickListenerC7418ll1 viewOnClickListenerC7418ll1 = new ViewOnClickListenerC7418ll1(this.l, this, this.a, this.h, this.g);
            l(viewOnClickListenerC7418ll1);
            this.k = viewOnClickListenerC7418ll1;
        } else {
            ViewOnClickListenerC1876Ol1 viewOnClickListenerC1876Ol1 = new ViewOnClickListenerC1876Ol1(this.l, this, this.a, this.h, this.g, this.i);
            m(viewOnClickListenerC1876Ol1);
            ChromeImageView chromeImageView = viewOnClickListenerC1876Ol1.r;
            if (chromeImageView != null) {
                viewOnClickListenerC1876Ol1.addView(chromeImageView);
            }
            viewOnClickListenerC1876Ol1.addView(viewOnClickListenerC1876Ol1.n);
            Iterator it = viewOnClickListenerC1876Ol1.o.iterator();
            while (it.hasNext()) {
                viewOnClickListenerC1876Ol1.addView((View) it.next());
            }
            DualControlLayout dualControlLayout = viewOnClickListenerC1876Ol1.s;
            if (dualControlLayout != null) {
                viewOnClickListenerC1876Ol1.addView(dualControlLayout);
            }
            ViewGroup viewGroup = viewOnClickListenerC1876Ol1.p;
            if (viewGroup != null) {
                viewOnClickListenerC1876Ol1.addView(viewGroup);
            }
            viewOnClickListenerC1876Ol1.addView(viewOnClickListenerC1876Ol1.m);
            this.k = viewOnClickListenerC1876Ol1;
        }
        return this.k;
    }

    public final String p() {
        View view = this.k;
        if (view == null) {
            return "";
        }
        TextView textView = (TextView) view.findViewById(R.id.infobar_message);
        CharSequence o = o(textView != null ? textView.getText() : null);
        if (o.length() > 0) {
            o = ((Object) o) + " ";
        }
        return ((Object) o) + this.l.getString(R.string.f69550_resource_name_obfuscated_res_0x7f1402b6);
    }

    public final boolean closeInfoBar() {
        if (this.m) {
            return false;
        }
        this.m = true;
        if (!((InfoBarContainer) this.j).n) {
            s();
            InfoBarContainer infoBarContainer = (InfoBarContainer) this.j;
            ArrayList arrayList = infoBarContainer.h;
            if (arrayList.remove(this)) {
                Iterator it = infoBarContainer.i.iterator();
                while (true) {
                    C11814ya2 c11814ya2 = (C11814ya2) it;
                    if (!c11814ya2.hasNext()) {
                        break;
                    }
                    InterfaceC9821sl1 interfaceC9821sl1 = (InterfaceC9821sl1) c11814ya2.next();
                    arrayList.isEmpty();
                    C0022Ae1 c0022Ae1 = ((C0282Ce1) interfaceC9821sl1).g;
                    if (c0022Ae1 != null && this.k == c0022Ae1.a) {
                        c0022Ae1.b.b();
                    }
                }
                C0447Dl1 c0447Dl1 = infoBarContainer.q.r;
                c0447Dl1.h.remove(this);
                c0447Dl1.e();
            }
        }
        this.j = null;
        this.k = null;
        this.l = null;
        return true;
    }

    public final boolean q() {
        ArrayList arrayList = ((InfoBarContainer) this.j).h;
        return !arrayList.isEmpty() && arrayList.get(0) == this;
    }

    public boolean j() {
        return this.n;
    }

    @Override // defpackage.InterfaceC1487Ll1
    public void e() {
        long j = this.o;
        if (j != 0) {
            N.M2s4r3u7(j, this);
        }
    }

    public final void r(int i) {
        long j = this.o;
        if (j != 0) {
            N.MQGsrOhB(j, this, i);
        }
    }

    @Override // defpackage.InterfaceC1487Ll1
    public void i() {
        long j = this.o;
        if (j == 0 || this.m) {
            return;
        }
        N.MKozrBH2(j, this);
    }
}
