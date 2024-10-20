package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import java.util.ArrayList;
import org.chromium.components.browser_ui.widget.tile.TileView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xh */
/* loaded from: classes2.dex */
public final class C3024Xh {
    public C3618ai a;
    public final C6367ii b;

    public C3024Xh(RecyclerView recyclerView, C6367ii c6367ii, ArrayList arrayList) {
        recyclerView.getContext();
        recyclerView.q0(new GridLayoutManager(4));
        C7616mK1 c7616mK1 = new C7616mK1();
        C4617dc3 c4617dc3 = new C4617dc3(c7616mK1);
        c4617dc3.Q(0, new InterfaceC7960nK1() { // from class: Wh
            @Override // defpackage.InterfaceC7960nK1
            public final View a(ViewGroup viewGroup) {
                TileView tileView = (TileView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0166, viewGroup, false);
                tileView.setClickable(true);
                return tileView;
            }
        }, new C7814mu());
        recyclerView.n0(c4617dc3);
        this.a = new C3618ai(recyclerView.getContext(), this, c7616mK1, arrayList);
        this.b = c6367ii;
    }
}
