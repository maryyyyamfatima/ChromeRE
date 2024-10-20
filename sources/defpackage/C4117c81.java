package defpackage;

import J.N;
import android.app.Activity;
import android.text.method.LinkMovementMethod;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.history.BrowsingHistoryBridge;
import org.chromium.chrome.browser.history.HistoryItemView;
import org.chromium.components.browser_ui.widget.MoreProgressButton;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: c81, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4117c81 extends AbstractC2630Ug0 implements InterfaceC7216l91 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public String E = "";
    public String F;
    public final InterfaceC7697ma2 G;
    public final BV0 H;
    public final O81 k;
    public final ArrayList l;
    public final VH0 m;
    public BrowsingHistoryBridge n;
    public View o;
    public Button p;
    public C1980Pg0 q;
    public C1980Pg0 r;
    public C1980Pg0 s;
    public MoreProgressButton t;
    public C1720Ng0 u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    @Override // defpackage.AbstractC8305oK2
    public final void A(RecyclerView recyclerView) {
    }

    @Override // defpackage.AbstractC8305oK2
    public final void F(RecyclerView recyclerView) {
    }

    public final void W(Q81 q81) {
        Pair N = N(q81.a);
        if (N == null) {
            AbstractC4851eH1.a("DateDividedAdapter", "Failed to find group for item during remove. Item position: " + q81.a + ", total size: " + this.i, new Object[0]);
        } else {
            C2370Sg0 c2370Sg0 = (C2370Sg0) N.first;
            c2370Sg0.b.remove(q81);
            int size = c2370Sg0.b.size();
            TreeSet treeSet = this.j;
            if (size == 1) {
                treeSet.remove(c2370Sg0);
            }
            if (Q() && treeSet.size() == 1) {
                R();
            }
            S();
            t();
        }
        BrowsingHistoryBridge browsingHistoryBridge = this.n;
        long j = browsingHistoryBridge.b;
        long[] jArr = q81.h;
        N.Mya3ANHw(j, browsingHistoryBridge, q81.c, Arrays.copyOf(jArr, jArr.length));
    }

    public C4117c81(O81 o81, BrowsingHistoryBridge browsingHistoryBridge, C8385oa2 c8385oa2, BV0 bv0) {
        this.H = bv0;
        K(true);
        this.n = browsingHistoryBridge;
        browsingHistoryBridge.a = this;
        this.k = o81;
        this.G = c8385oa2;
        c8385oa2.m(new Callback() { // from class: a81
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C4117c81.this.Y();
            }
        });
        this.m = new VH0();
        this.l = new ArrayList();
    }

    public final void a0() {
        this.x = false;
        this.y = true;
        this.B = true;
        String str = this.F;
        if (str != null) {
            BrowsingHistoryBridge browsingHistoryBridge = this.n;
            N.ML$TCyGp(browsingHistoryBridge.b, browsingHistoryBridge, new ArrayList(), str, true);
        } else {
            BrowsingHistoryBridge browsingHistoryBridge2 = this.n;
            N.ML$TCyGp(browsingHistoryBridge2.b, browsingHistoryBridge2, new ArrayList(), this.E, false);
        }
    }

    public final void V() {
        if (!this.y && this.A) {
            this.y = true;
            c0();
            t();
            BrowsingHistoryBridge browsingHistoryBridge = this.n;
            N.MuGq8Vn6(browsingHistoryBridge.b, browsingHistoryBridge, new ArrayList());
        }
    }

    public final void X() {
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((HistoryItemView) it.next()).t();
        }
        a0();
        b0();
    }

    public final ViewGroup T(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(this.k.a).inflate(R.layout.f57780_resource_name_obfuscated_res_0x7f0e011c, viewGroup, false);
        ((Button) viewGroup2.findViewById(R.id.clear_browsing_data_button)).setOnClickListener(new View.OnClickListener() { // from class: b81
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4117c81.this.k.g.e();
            }
        });
        return viewGroup2;
    }

    public final ViewGroup U(ViewGroup viewGroup) {
        Activity activity = this.k.a;
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(activity).inflate(R.layout.f57860_resource_name_obfuscated_res_0x7f0e0124, viewGroup, false);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.privacy_disclaimer);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(AbstractC9108qg3.a(activity.getResources().getString(R.string.f67480_resource_name_obfuscated_res_0x7f1401e1), new C8765pg3(new C11997z52(activity, new Callback() { // from class: Y71
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                O81 o81 = C4117c81.this.k;
                o81.getClass();
                o81.f(new GURL("https://myactivity.google.com/myactivity/?utm_source=chrome_h"), null, true);
            }
        }), "<link>", "</link>")));
        return viewGroup2;
    }

    public final void Y() {
        C1980Pg0 c1980Pg0;
        ArrayList arrayList = new ArrayList();
        if (this.C) {
            arrayList.add(this.q);
        }
        if (this.D) {
            arrayList.add(this.r);
        }
        Object obj = ((C8385oa2) this.G).g;
        if ((obj != null && ((Boolean) obj).booleanValue()) && (c1980Pg0 = this.s) != null) {
            arrayList.add(c1980Pg0);
        }
        C1980Pg0[] c1980Pg0Arr = (C1980Pg0[]) arrayList.toArray(new C1980Pg0[arrayList.size()]);
        if (c1980Pg0Arr == null || c1980Pg0Arr.length == 0) {
            R();
            return;
        }
        boolean Q = Q();
        TreeSet treeSet = this.j;
        if (Q) {
            treeSet.remove(treeSet.first());
        }
        C2110Qg0 c2110Qg0 = new C2110Qg0();
        for (C1980Pg0 c1980Pg02 : c1980Pg0Arr) {
            c2110Qg0.a(c1980Pg02);
        }
        treeSet.add(c2110Qg0);
        S();
        t();
    }

    public final void c0() {
        boolean z = false;
        O81 o81 = this.k;
        if (((o81 != null && o81.j) || this.y) && !P()) {
            C1850Og0 c1850Og0 = new C1850Og0();
            c1850Og0.a(this.u);
            if (o81 != null && o81.j) {
                z = true;
            }
            if (z) {
                this.t.a(1);
            } else {
                this.t.a(2);
            }
            this.j.add(c1850Og0);
            S();
            t();
        }
    }

    public final void Z() {
        O81 o81 = this.k;
        boolean z = (!o81.i && this.v) && o81.r;
        if (this.C == z) {
            return;
        }
        this.C = z;
        if (this.x) {
            Y();
        }
    }

    public final void b0() {
        boolean d;
        if (this.p == null || this.D == (d = this.k.d())) {
            return;
        }
        this.D = d;
        this.o.setVisibility(d ? 8 : 0);
        if (this.x) {
            Y();
        }
    }
}
