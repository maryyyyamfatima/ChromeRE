package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import java.util.HashMap;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: v3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10610v3 {
    public final C9581s3 a;
    public final ZX1 b;
    public final PropertyModel c;

    public C10610v3(Context context, InterfaceC9238r3 interfaceC9238r3, ZX1 zx1) {
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.f55530_resource_name_obfuscated_res_0x7f0e0027, (ViewGroup) null);
        recyclerView.q0(new LinearLayoutManager());
        this.a = new C9581s3(recyclerView, interfaceC9238r3);
        this.b = zx1;
        HashMap e = PropertyModel.e(AbstractC4249cY1.B);
        PD2 pd2 = AbstractC4249cY1.c;
        String string = context.getString(R.string.f86980_resource_name_obfuscated_res_0x7f140a56);
        GD2 gd2 = new GD2();
        gd2.a = string;
        e.put(pd2, gd2);
        LD2 ld2 = AbstractC4249cY1.r;
        AD2 ad2 = new AD2();
        ad2.a = true;
        e.put(ld2, ad2);
        PD2 pd22 = AbstractC4249cY1.h;
        GD2 gd22 = new GD2();
        gd22.a = recyclerView;
        e.put(pd22, gd22);
        JD2 jd2 = AbstractC4249cY1.a;
        C10267u3 c10267u3 = new C10267u3(this);
        GD2 gd23 = new GD2();
        gd23.a = c10267u3;
        PropertyModel a = AbstractC1996Pj1.a(e, jd2, gd23, e);
        this.c = a;
        zx1.l(a, 1, false);
    }

    public final void a() {
        this.b.c(3, this.c);
    }
}
