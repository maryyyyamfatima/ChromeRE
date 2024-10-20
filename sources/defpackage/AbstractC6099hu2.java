package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.style.StyleSpan;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import com.android.chrome.R;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.chromium.components.browser_ui.contacts_picker.ContactView;
import org.chromium.components.browser_ui.contacts_picker.TopView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hu2 */
/* loaded from: classes2.dex */
public abstract class AbstractC6099hu2 extends AbstractC8305oK2 implements M40, RS3 {
    public static boolean r;
    public static boolean s;
    public static boolean t;
    public static boolean u;
    public static boolean v;
    public Context i;
    public ViewOnClickListenerC10219tu2 j;
    public TopView k;
    public String l;
    public ContentResolver m;
    public ArrayList n;
    public String o;
    public boolean p;
    public ArrayList q;

    public final void N(String str) {
        if (str.equals("")) {
            ArrayList arrayList = this.q;
            if (arrayList == null) {
                return;
            }
            arrayList.clear();
            this.q = null;
        } else {
            this.q = new ArrayList();
            Integer num = 0;
            String lowerCase = str.toLowerCase(Locale.getDefault());
            Iterator it = this.n.iterator();
            while (it.hasNext()) {
                A40 a40 = (A40) it.next();
                if (a40.g.toLowerCase(Locale.getDefault()).contains(lowerCase) || a40.b(r, t, u).toLowerCase(Locale.getDefault()).contains(lowerCase)) {
                    this.q.add(num);
                }
                num = Integer.valueOf(num.intValue() + 1);
            }
        }
        t();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M(java.util.ArrayList r12) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC6099hu2.M(java.util.ArrayList):void");
    }

    @Override // defpackage.AbstractC8305oK2
    public final int s(int i) {
        return (i != 0 || this.p) ? 1 : 0;
    }

    @Override // defpackage.AbstractC8305oK2
    public final d E(int i, RecyclerView recyclerView) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            ContactView contactView = (ContactView) AbstractC9192qu3.a(recyclerView, R.layout.0_resource_name_obfuscated_res_0x7f0e0097, recyclerView, false);
            ViewOnClickListenerC10219tu2 viewOnClickListenerC10219tu2 = this.j;
            contactView.G = viewOnClickListenerC10219tu2;
            contactView.m(viewOnClickListenerC10219tu2.n);
            return new K40(contactView, this.j, this.m, this.i.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080132));
        }
        TopView topView = (TopView) AbstractC9192qu3.a(recyclerView, R.layout.0_resource_name_obfuscated_res_0x7f0e02cc, recyclerView, false);
        this.k = topView;
        ((TextView) topView.findViewById(R.id.explanation)).setText(AbstractC9108qg3.a(topView.a.getString(R.string.0_resource_name_obfuscated_res_0x7f140404, this.l), new C8765pg3(new StyleSpan(1), "<b>", "</b>")));
        TopView topView2 = this.k;
        ViewOnClickListenerC10219tu2 viewOnClickListenerC10219tu22 = this.j;
        topView2.j = viewOnClickListenerC10219tu22;
        topView2.p = this;
        if (viewOnClickListenerC10219tu22.s) {
            topView2.h.setOnCheckedChangeListener(topView2);
        } else {
            topView2.g.setVisibility(8);
        }
        TopView topView3 = this.k;
        ViewOnClickListenerC10219tu2 viewOnClickListenerC10219tu23 = this.j;
        topView3.k.setVisibility(viewOnClickListenerC10219tu23.t ? 0 : 8);
        topView3.l.setVisibility(viewOnClickListenerC10219tu23.w ? 0 : 8);
        topView3.m.setVisibility(viewOnClickListenerC10219tu23.u ? 0 : 8);
        topView3.n.setVisibility(viewOnClickListenerC10219tu23.v ? 0 : 8);
        topView3.o.setVisibility(viewOnClickListenerC10219tu23.x ? 0 : 8);
        ViewOnClickListenerC10219tu2 viewOnClickListenerC10219tu24 = this.j;
        TopView topView4 = this.k;
        viewOnClickListenerC10219tu24.k = topView4;
        if (this.n != null) {
            topView4.i.setText(NumberFormat.getInstance().format(r7.size()));
        }
        return new ViewOnClickListenerC5411fu2(this.k);
    }

    @Override // defpackage.AbstractC8305oK2
    public final int q() {
        ArrayList arrayList = this.q;
        if (arrayList != null) {
            return arrayList.size();
        }
        ArrayList arrayList2 = this.n;
        if (arrayList2 == null || arrayList2.size() == 0) {
            return 0;
        }
        return this.n.size() + (!this.p ? 1 : 0);
    }

    @Override // defpackage.AbstractC8305oK2
    public final void C(d dVar, int i) {
        A40 a40;
        ArrayList arrayList;
        if (dVar.k != 1) {
            return;
        }
        K40 k40 = (K40) dVar;
        boolean z = this.p;
        if (!z || (arrayList = this.q) == null) {
            a40 = (A40) this.n.get(i - (!z ? 1 : 0));
        } else {
            a40 = (A40) this.n.get(((Integer) arrayList.get(i)).intValue());
        }
        k40.C = a40;
        Drawable drawable = a40.m;
        ContactView contactView = k40.B;
        if (drawable != null) {
            contactView.t(a40, ((BitmapDrawable) drawable).getBitmap());
            return;
        }
        C6461iy c6461iy = k40.z.o.a;
        String str = a40.a;
        Bitmap a = c6461iy.a(str);
        if (a == null && !str.equals("-1")) {
            FL0 fl0 = new FL0(k40.C.a, k40.A, k40);
            k40.D = fl0;
            fl0.i = k40.E;
            fl0.c(AbstractC0185Bl.e);
        }
        contactView.t(a40, a);
    }
}
