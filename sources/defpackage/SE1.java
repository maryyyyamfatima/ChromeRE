package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.android.chrome.R;
import java.util.HashMap;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class SE1 {
    public final WE1 a;
    public final RelativeLayout b;
    public final View c;

    public static SE1 a(InterfaceC7697ma2 interfaceC7697ma2, Context context) {
        return new SE1(new WE1(interfaceC7697ma2, new Handler(Looper.getMainLooper())), (RelativeLayout) LayoutInflater.from(context).inflate(R.layout.f58600_resource_name_obfuscated_res_0x7f0e016f, (ViewGroup) null), (RelativeLayout) LayoutInflater.from(context).inflate(R.layout.f58610_resource_name_obfuscated_res_0x7f0e0170, (ViewGroup) null));
    }

    public SE1(WE1 we1, RelativeLayout relativeLayout, RelativeLayout relativeLayout2) {
        this.a = we1;
        this.b = relativeLayout;
        this.c = relativeLayout2;
    }

    public final void c() {
        HashMap e = PropertyModel.e(AbstractC4249cY1.B);
        HD2 hd2 = AbstractC4249cY1.w;
        AD2 ad2 = new AD2();
        ad2.a = true;
        e.put(hd2, ad2);
        LD2 ld2 = AbstractC4249cY1.z;
        AD2 ad22 = new AD2();
        ad22.a = true;
        e.put(ld2, ad22);
        JD2 jd2 = AbstractC4249cY1.a;
        GD2 gd2 = new GD2();
        WE1 we1 = this.a;
        gd2.a = we1;
        e.put(jd2, gd2);
        PD2 pd2 = AbstractC4249cY1.h;
        GD2 gd22 = new GD2();
        gd22.a = this.b;
        e.put(pd2, gd22);
        PD2 pd22 = AbstractC4249cY1.i;
        GD2 gd23 = new GD2();
        View view = this.c;
        gd23.a = view;
        final PropertyModel a = AbstractC5266fV2.a(e, pd22, gd23, e);
        view.findViewById(R.id.cancel_loading_modal).setOnClickListener(new View.OnClickListener() { // from class: RE1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SE1.this.a.c(1, a);
            }
        });
        ZX1 zx1 = (ZX1) ((C8385oa2) we1.g).g;
        if (zx1 == null) {
            return;
        }
        we1.i = zx1;
        we1.j = a;
        we1.l = 1;
        we1.a.postDelayed(new VE1(we1), 500L);
    }

    public final void b() {
        WE1 we1 = this.a;
        if (we1.l == 1) {
            we1.a.removeCallbacks(new VE1(we1));
        }
        we1.l = 3;
        if (we1.e()) {
            we1.i.c(13, we1.j);
        }
    }
}
