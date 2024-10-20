package defpackage;

import J.N;
import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Collection;
import org.chromium.components.browser_ui.widget.listmenu.ListMenuButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gw1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0892Gw1 extends AbstractC12269zt0 {
    public AbstractC0892Gw1(Context context) {
        super(context);
        this.o = new C0502Dw1(this);
    }

    @Override // defpackage.AbstractC8305oK2
    public final d E(int i, RecyclerView recyclerView) {
        return new C0762Fw1(AbstractC9192qu3.a(recyclerView, R.layout.f55420_resource_name_obfuscated_res_0x7f0e001c, recyclerView, false));
    }

    @Override // defpackage.AbstractC8305oK2
    public void C(d dVar, int i) {
        C0762Fw1 c0762Fw1 = (C0762Fw1) dVar;
        C10230tw1 c10230tw1 = (C10230tw1) this.k.get(i);
        c0762Fw1.z.setText(c10230tw1.b);
        String str = c10230tw1.b;
        String str2 = c10230tw1.c;
        boolean equals = TextUtils.equals(str, str2);
        TextView textView = c0762Fw1.A;
        if (equals) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str2);
        }
        ListMenuButton listMenuButton = c0762Fw1.C;
        AbstractC4433d33.a(listMenuButton.getContext(), listMenuButton, str, 0);
        c0762Fw1.B.setVisibility(8);
        listMenuButton.setVisibility(8);
    }

    @Override // defpackage.AbstractC12269zt0
    public final void Q(ArrayList arrayList) {
        String[] strArr = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            strArr[i] = ((C10230tw1) arrayList.get(i)).a;
        }
        C9549rx1.b().getClass();
        N.Mo7xRjdk(strArr);
        C9549rx1.g(8);
        t();
    }

    public final void R(Collection collection) {
        this.k = new ArrayList(collection);
        t();
    }

    @Override // defpackage.AbstractC12269zt0
    public final boolean O(d dVar) {
        return dVar instanceof C0762Fw1;
    }

    @Override // defpackage.AbstractC12269zt0
    public final boolean P(d dVar) {
        return dVar instanceof C0762Fw1;
    }
}
