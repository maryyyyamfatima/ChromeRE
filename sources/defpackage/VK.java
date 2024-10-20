package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.components.browser_ui.widget.chips.ChipView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class VK {
    public final RecyclerView a;

    public VK(final Context context, C7616mK1 c7616mK1) {
        RecyclerView recyclerView = new RecyclerView(context, null);
        this.a = recyclerView;
        recyclerView.q0(new LinearLayoutManager(0, false));
        recyclerView.S.f = 0L;
        C4617dc3 c4617dc3 = new C4617dc3(c7616mK1);
        c4617dc3.Q(0, new InterfaceC7960nK1() { // from class: TK
            public final /* synthetic */ int b = R.style.f99010_resource_name_obfuscated_res_0x7f1502d9;

            @Override // defpackage.InterfaceC7960nK1
            public final View a(ViewGroup viewGroup) {
                return new ChipView(context, this.b);
            }
        }, new DJ0());
        recyclerView.n0(c4617dc3);
    }

    public static C7272lK1 a(int i, int i2, String str, Callback callback) {
        BD2 bd2 = new BD2(OK.i);
        bd2.c(OK.e, i);
        bd2.e(OK.g, str);
        bd2.e(OK.b, str);
        bd2.e(OK.a, callback);
        bd2.c(OK.d, i2);
        bd2.b(OK.c, true);
        bd2.b(OK.f, false);
        bd2.c(OK.h, 0);
        return new C7272lK1(0, bd2.a());
    }
}
