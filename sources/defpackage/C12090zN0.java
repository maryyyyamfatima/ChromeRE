package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import java.util.Iterator;
import org.chromium.base.Callback;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zN0 */
/* loaded from: classes.dex */
public final class C12090zN0 {
    public final C12157za2 a = new C12157za2();
    public final PropertyModel b;
    public final DN0 c;
    public final VK d;
    public final C10718vN0 e;
    public final InterfaceC0079Ap3 f;

    public C12090zN0(Context context, C6134i03 c6134i03, C2332Ry2 c2332Ry2) {
        PropertyModel propertyModel = new PropertyModel(BN0.e);
        this.b = propertyModel;
        C10718vN0 c10718vN0 = new C10718vN0(context, new C11061wN0(this), c6134i03);
        this.e = c10718vN0;
        VK vk = new VK(context, c10718vN0.k);
        this.d = vk;
        UK uk = new UK(context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0800e9), context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0800ea));
        RecyclerView recyclerView = vk.a;
        recyclerView.g(uk);
        this.f = c2332Ry2;
        DN0 dn0 = new DN0(context);
        this.c = dn0;
        UD2.a(propertyModel, dn0, new EN0());
        propertyModel.o(BN0.c, new Callback() { // from class: xN0
            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C12090zN0.this.a(((Integer) obj).intValue());
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }
        });
        propertyModel.m(BN0.b, 0);
        propertyModel.o(BN0.a, recyclerView);
        propertyModel.k(BN0.d, ((Boolean) c2332Ry2.get()).booleanValue());
    }

    public final void a(int i) {
        ND2 nd2 = BN0.b;
        PropertyModel propertyModel = this.b;
        propertyModel.m(nd2, i);
        PD2 pd2 = BN0.a;
        if (i == 0) {
            propertyModel.o(pd2, this.d.a);
        } else if (i == 1) {
            propertyModel.o(pd2, null);
        }
        int f = i == 0 ? this.e.f() : 7;
        Iterator it = this.a.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC11747yN0) c11814ya2.next()).a(f);
            }
        }
    }
}
