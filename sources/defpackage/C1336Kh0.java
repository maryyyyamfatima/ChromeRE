package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kh0 */
/* loaded from: classes.dex */
public final class C1336Kh0 {
    public final C0351Cs0 a;
    public final C3160Yi0 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final C0556Eh0 i;
    public final C0946Hh0 j;
    public final QZ3 k;

    public C1336Kh0(final Context context, C0351Cs0 c0351Cs0, C3160Yi0 c3160Yi0, C9177qs0 c9177qs0) {
        this.a = c0351Cs0;
        this.b = c3160Yi0;
        this.c = context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0801cd);
        this.d = context.getResources().getDimensionPixelOffset(R.dimen.0_resource_name_obfuscated_res_0x7f0801ce);
        this.f = context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0801cc);
        this.e = context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0801d0);
        this.g = context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0801d5);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0801cf);
        C0556Eh0 c0556Eh0 = new C0556Eh0(this, context);
        this.i = c0556Eh0;
        c0556Eh0.setId(R.id.download_home_recycler_view);
        c0556Eh0.z = true;
        AbstractC2348Sb3 abstractC2348Sb3 = c0556Eh0.S;
        ((C3165Yj0) abstractC2348Sb3).g = false;
        abstractC2348Sb3.e = 0L;
        C0946Hh0 c0946Hh0 = new C0946Hh0(this);
        this.j = c0946Hh0;
        c0556Eh0.q0(c0946Hh0);
        c0556Eh0.g(new C1076Ih0(this));
        c0556Eh0.setClipToPadding(false);
        UD2.a(c3160Yi0.g.i, c0556Eh0, new HD1());
        final C1466Lh0 c1466Lh0 = new C1466Lh0(c3160Yi0, new C1206Jh0(this, c3160Yi0), new QK2() { // from class: Bh0
            @Override // defpackage.QK2
            public final Object a(int i, RecyclerView recyclerView) {
                int i2 = RC1.z;
                switch (i) {
                    case 1:
                        int i3 = C3291Zi1.F;
                        return new C3291Zi1(LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e00e6, (ViewGroup) null));
                    case 2:
                        int i4 = C5967hY0.L;
                        return new C5967hY0(LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e00e3, (ViewGroup) null));
                    case ModuleDescriptor.MODULE_VERSION /* 3 */:
                        return new Bb4(LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e00ec, (ViewGroup) null));
                    case 4:
                        return new C10168tm(LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e00dd, (ViewGroup) null));
                    case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    case 6:
                        return new C5682gi1(LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e00e4, (ViewGroup) null));
                    case 7:
                        return new C6350if0(recyclerView);
                    case 8:
                        return new C9230r13(LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e00eb, (ViewGroup) null));
                    case 9:
                        return new C3970bj1(LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e00e7, (ViewGroup) null));
                    case 10:
                        return new C3626aj1(LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e00e5, (ViewGroup) null));
                    case 11:
                        return new C2072Py2(LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e00e9, (ViewGroup) null));
                    case 12:
                        return new C2462Sy2(LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e00ea, (ViewGroup) null));
                    case 13:
                        return new C10682vG(LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e00e2, (ViewGroup) null));
                    case 14:
                        return new C9996tG(LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e00e1, (ViewGroup) null));
                    case 15:
                        return new C5532gG(LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e00e0, (ViewGroup) null));
                    case 16:
                        return new C5188fG(LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e00df, (ViewGroup) null));
                    case 17:
                        return new C4844eG(LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e00de, (ViewGroup) null));
                    case 18:
                        return new C5339fi2(LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e00e8, (ViewGroup) null));
                    default:
                        return null;
                }
            }
        });
        c0556Eh0.n0(c1466Lh0);
        c0556Eh0.post(new Runnable() { // from class: Ch0
            @Override // java.lang.Runnable
            public final void run() {
                C1466Lh0.this.t();
            }
        });
        c0556Eh0.i(new C0686Fh0(this, c9177qs0));
        QZ3 qz3 = new QZ3(c0556Eh0);
        this.k = qz3;
        qz3.a(new InterfaceC5041eq0() { // from class: Dh0
            @Override // defpackage.InterfaceC5041eq0
            public final void a(PZ3 pz3) {
                int i;
                C1336Kh0 c1336Kh0 = C1336Kh0.this;
                c1336Kh0.getClass();
                Resources resources = context.getResources();
                if (pz3.a == 2) {
                    i = Math.max(resources.getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0801d1), (int) (((resources.getConfiguration().screenWidthDp - 600) / 2.0f) * resources.getDisplayMetrics().density));
                } else {
                    i = 0;
                }
                C0556Eh0 c0556Eh02 = c1336Kh0.i;
                int paddingTop = c0556Eh02.getPaddingTop();
                int paddingBottom = c0556Eh02.getPaddingBottom();
                WeakHashMap weakHashMap = Ec4.a;
                c0556Eh02.setPaddingRelative(i, paddingTop, i, paddingBottom);
            }
        });
    }

    public static boolean a(C1336Kh0 c1336Kh0, int i) {
        C3160Yi0 c3160Yi0 = c1336Kh0.b;
        OC1 oc1 = c3160Yi0.get(i);
        if (!(oc1 instanceof KC1)) {
            return false;
        }
        OC1 oc12 = i >= c3160Yi0.size() - 1 ? null : c3160Yi0.get(i + 1);
        if (oc12 instanceof KC1) {
            if (!(((KC1) oc1).e.i != ((KC1) oc12).e.i)) {
                return false;
            }
        }
        return true;
    }
}
