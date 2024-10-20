package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class GM3 implements QK2 {
    public final InterfaceC0079Ap3 a;

    public GM3(AM3 am3) {
        this.a = am3;
    }

    @Override // defpackage.QK2
    public final Object a(int i, RecyclerView recyclerView) {
        View a = AbstractC9192qu3.a(recyclerView, R.layout.0_resource_name_obfuscated_res_0x7f0e0237, recyclerView, false);
        ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
        InterfaceC0079Ap3 interfaceC0079Ap3 = this.a;
        layoutParams.width = ((C12088zM3) interfaceC0079Ap3.get()).a;
        a.getLayoutParams().height = ((C12088zM3) interfaceC0079Ap3.get()).a;
        return new FM3(a);
    }
}
