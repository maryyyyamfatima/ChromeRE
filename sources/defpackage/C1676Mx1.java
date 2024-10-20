package defpackage;

import android.app.Activity;
import android.view.MenuItem;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mx1 */
/* loaded from: classes2.dex */
public final class C1676Mx1 {
    public final Activity a;
    public final ViewGroup b;
    public C3024Xh c;
    public C6367ii d;

    public C1676Mx1(Activity activity, InterfaceC0079Ap3 interfaceC0079Ap3, I53 i53, ArrayList arrayList, boolean z) {
        this.a = activity;
        ViewGroup viewGroup = (ViewGroup) activity.getLayoutInflater().inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0164, (ViewGroup) null);
        this.b = viewGroup;
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(R.id.launchpad_recycler);
        C6367ii c6367ii = new C6367ii(activity, interfaceC0079Ap3, i53);
        this.d = c6367ii;
        this.c = new C3024Xh(recyclerView, c6367ii, arrayList);
        Toolbar toolbar = (Toolbar) viewGroup.findViewById(R.id.toolbar);
        toolbar.F(R.string.0_resource_name_obfuscated_res_0x7f1405ae);
        toolbar.s(R.menu.0_resource_name_obfuscated_res_0x7f100007);
        if (!z) {
            toolbar.o().removeItem(R.id.close_menu_id);
        }
        toolbar.N = new BO3() { // from class: Kx1
            @Override // defpackage.BO3
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C1676Mx1 c1676Mx1 = C1676Mx1.this;
                c1676Mx1.getClass();
                if (menuItem.getItemId() != R.id.close_menu_id) {
                    return false;
                }
                c1676Mx1.a.finish();
                return true;
            }
        };
        recyclerView.i(new C1546Lx1(viewGroup.findViewById(R.id.shadow), recyclerView));
    }

    public final void a() {
        C3024Xh c3024Xh = this.c;
        c3024Xh.a.d.clear();
        c3024Xh.a = null;
        this.c = null;
        C6367ii c6367ii = this.d;
        ((ZX1) c6367ii.g.get()).c(7, c6367ii.i);
        this.d = null;
    }
}
