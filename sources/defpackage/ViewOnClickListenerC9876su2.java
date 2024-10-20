package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.util.DisplayMetrics;
import android.util.LruCache;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.ThreadUtils;
import org.chromium.components.browser_ui.photo_picker.PickerVideoPlayer;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: su2 */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC9876su2 extends RelativeLayout implements InterfaceC9684sM0, GK2, InterfaceC2380Si0, View.OnClickListener, InterfaceC7182l33 {
    public int A;
    public int B;
    public int C;
    public C10027tM0 D;
    public long E;
    public boolean F;
    public ArrayList G;
    public final PickerVideoPlayer H;
    public final ImageView I;
    public DialogC3693au2 a;
    public final WindowAndroid g;
    public final ContentResolver h;
    public List i;
    public final boolean j;
    public InterfaceC4037bu2 k;
    public BinderC2640Ui0 l;
    public final RecyclerView m;
    public final C5755gu2 n;
    public final GridLayoutManager o;
    public C9191qu2 p;
    public final C7526m33 q;
    public C1111Io0 r;
    public C1111Io0 s;
    public C1111Io0 t;
    public final int u;
    public final int v;
    public final int w;
    public boolean x;
    public boolean y;
    public int z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ViewOnClickListenerC9876su2(org.chromium.ui.base.WindowAndroid r17, android.content.ContentResolver r18, boolean r19, defpackage.InterfaceC4380cu2 r20) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewOnClickListenerC9876su2.<init>(org.chromium.ui.base.WindowAndroid, android.content.ContentResolver, boolean, cu2):void");
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
        this.o.u1(this.z);
        C9191qu2 c9191qu2 = this.p;
        RecyclerView recyclerView = this.m;
        recyclerView.f0(c9191qu2);
        C9191qu2 c9191qu22 = new C9191qu2(this, this.z, this.A);
        this.p = c9191qu22;
        recyclerView.g(c9191qu22);
        if (this.i != null) {
            this.n.t();
            recyclerView.requestLayout();
        }
    }

    @Override // defpackage.GK2
    public final void a(d dVar) {
        int i;
        C6441iu2 c6441iu2 = ((C6785ju2) dVar).B;
        String path = (c6441iu2 == null || !((i = c6441iu2.h) == 0 || i == 3)) ? null : c6441iu2.a.getPath();
        if (path != null) {
            BinderC2640Ui0 binderC2640Ui0 = this.l;
            binderC2640Ui0.getClass();
            Object obj = ThreadUtils.a;
            Iterator it = binderC2640Ui0.v.iterator();
            while (it.hasNext()) {
                if (((C2250Ri0) it.next()).a.getPath().equals(path)) {
                    it.remove();
                }
            }
        }
    }

    @Override // defpackage.InterfaceC7182l33
    public final void d(ArrayList arrayList) {
        ImageView imageView = this.I;
        if (imageView.getVisibility() != 0) {
            imageView.setVisibility(0);
            imageView.setOnClickListener(this);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        C7526m33 c7526m33 = this.q;
        int i = 0;
        if (id == R.id.done) {
            ArrayList c = c7526m33.c();
            Collections.sort(c);
            Uri[] uriArr = new Uri[c.size()];
            Iterator it = c.iterator();
            while (it.hasNext()) {
                uriArr[i] = ((C6441iu2) it.next()).a;
                i++;
            }
            c(1, uriArr, 1);
            return;
        }
        if (id == R.id.zoom) {
            if (this.y) {
                return;
            }
            HashSet hashSet = new HashSet(c7526m33.c);
            c7526m33.b();
            this.x = !this.x;
            Context context = (Context) this.g.j.get();
            boolean z = this.x;
            ImageView imageView = this.I;
            if (z) {
                imageView.setImageResource(R.drawable.0_resource_name_obfuscated_res_0x7f0904f0);
                imageView.setContentDescription(context.getString(R.string.0_resource_name_obfuscated_res_0x7f140836));
            } else {
                imageView.setImageResource(R.drawable.0_resource_name_obfuscated_res_0x7f0904ef);
                imageView.setContentDescription(context.getString(R.string.0_resource_name_obfuscated_res_0x7f140835));
            }
            b();
            if (!this.x) {
                e().evictAll();
            }
            this.y = true;
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.addListener(new C8505ou2(this, hashSet));
            RecyclerView recyclerView = this.m;
            TransitionManager.beginDelayedTransition(recyclerView, changeBounds);
            this.o.u1(this.z);
            this.n.t();
            recyclerView.requestLayout();
            return;
        }
        c(0, null, 0);
    }

    public final LruCache i() {
        C1111Io0 c1111Io0 = this.r;
        if (c1111Io0 == null || c1111Io0.a == null) {
            this.r = AbstractC6474j01.a.a(new LruCache(this.v));
        }
        return (LruCache) this.r.a;
    }

    public final LruCache f() {
        C1111Io0 c1111Io0 = this.s;
        if (c1111Io0 == null || c1111Io0.a == null) {
            this.s = AbstractC6474j01.a.a(new LruCache(this.u));
        }
        return (LruCache) this.s.a;
    }

    public final LruCache e() {
        C1111Io0 c1111Io0 = this.t;
        if (c1111Io0 == null || c1111Io0.a == null) {
            this.t = AbstractC6474j01.a.a(new LruCache(this.w));
        }
        return (LruCache) this.t.a;
    }

    public final void b() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Context context = (Context) this.g.j.get();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080670);
        int dimensionPixelSize2 = this.x ? 0 : context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08066f);
        this.A = dimensionPixelSize2;
        int max = this.x ? 1 : Math.max(1, (i - dimensionPixelSize2) / (dimensionPixelSize + dimensionPixelSize2));
        this.z = max;
        this.B = (i - ((max + 1) * this.A)) / max;
        if (this.x) {
            findViewById(R.id.action_bar_bg).getHeight();
        }
        boolean z = this.x;
        if (!z) {
            this.C = this.B;
        }
        if (z) {
            return;
        }
        boolean z2 = this.z % 2 == 0;
        int i2 = this.A;
        if (z2 != (i2 % 2 == 0)) {
            this.A = i2 + 1;
        }
    }

    public final void c(int i, Uri[] uriArr, int i2) {
        this.k.a(i, uriArr);
        DialogC3693au2 dialogC3693au2 = this.a;
        if (dialogC3693au2 != null) {
            dialogC3693au2.dismiss();
        }
        EI2.h(i2, 4, "Android.PhotoPicker.DialogAction");
        C5755gu2 c5755gu2 = this.n;
        EI2.e(c5755gu2.k, "Android.PhotoPicker.DecodeRequests");
        EI2.e(c5755gu2.j, "Android.PhotoPicker.CacheHits");
    }
}
