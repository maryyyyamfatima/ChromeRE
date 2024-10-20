package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.PriorityQueue;
import org.chromium.base.ThreadUtils;
import org.chromium.components.browser_ui.photo_picker.PickerBitmapView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gu2 */
/* loaded from: classes2.dex */
public final class C5755gu2 extends AbstractC8305oK2 {
    public final ViewOnClickListenerC9876su2 i;
    public int j;
    public int k;

    public C5755gu2(ViewOnClickListenerC9876su2 viewOnClickListenerC9876su2) {
        this.i = viewOnClickListenerC9876su2;
    }

    @Override // defpackage.AbstractC8305oK2
    public final d E(int i, RecyclerView recyclerView) {
        PickerBitmapView pickerBitmapView = (PickerBitmapView) AbstractC9192qu3.a(recyclerView, R.layout.0_resource_name_obfuscated_res_0x7f0e01fc, recyclerView, false);
        ViewOnClickListenerC9876su2 viewOnClickListenerC9876su2 = this.i;
        pickerBitmapView.o = viewOnClickListenerC9876su2;
        C7526m33 c7526m33 = viewOnClickListenerC9876su2.q;
        pickerBitmapView.p = c7526m33;
        pickerBitmapView.m(c7526m33);
        return new C6785ju2(pickerBitmapView);
    }

    @Override // defpackage.AbstractC8305oK2
    public final void C(d dVar, int i) {
        C9533ru2 c9533ru2;
        if (dVar instanceof C6785ju2) {
            C6785ju2 c6785ju2 = (C6785ju2) dVar;
            ViewOnClickListenerC9876su2 viewOnClickListenerC9876su2 = this.i;
            c6785ju2.z = viewOnClickListenerC9876su2;
            C6441iu2 c6441iu2 = (C6441iu2) viewOnClickListenerC9876su2.i.get(i);
            c6785ju2.B = c6441iu2;
            int i2 = c6441iu2.h;
            char c = 0;
            if (i2 == 1 || i2 == 2) {
                c6785ju2.A.p(c6441iu2, null, null, false, -1.0f);
            } else {
                String path = c6441iu2.a.getPath();
                ViewOnClickListenerC9876su2 viewOnClickListenerC9876su22 = c6785ju2.z;
                if (viewOnClickListenerC9876su22.x) {
                    c9533ru2 = (C9533ru2) viewOnClickListenerC9876su22.e().get(path);
                } else {
                    c9533ru2 = (C9533ru2) viewOnClickListenerC9876su22.f().get(path);
                }
                if (c9533ru2 != null) {
                    c6785ju2.A.p(c6785ju2.B, c9533ru2.a, c9533ru2.b, false, c9533ru2.c);
                    c = 1;
                } else {
                    ViewOnClickListenerC9876su2 viewOnClickListenerC9876su23 = c6785ju2.z;
                    int i3 = viewOnClickListenerC9876su23.B;
                    C9533ru2 c9533ru22 = viewOnClickListenerC9876su23.x ? (C9533ru2) viewOnClickListenerC9876su23.f().get(path) : null;
                    if (c9533ru22 == null) {
                        c9533ru22 = (C9533ru2) c6785ju2.z.i().get(path);
                    }
                    if (c9533ru22 != null) {
                        Bitmap bitmap = (Bitmap) c9533ru22.a.get(0);
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        Bitmap d = AbstractC0640Ey.d(bitmap, i3);
                        EI2.n(SystemClock.elapsedRealtime() - elapsedRealtime, "Android.PhotoPicker.UpscaleLowResBitmap");
                        ArrayList arrayList = new ArrayList(1);
                        arrayList.add(d);
                        c6785ju2.A.p(c6785ju2.B, arrayList, c9533ru22.b, true, c9533ru22.c);
                    } else {
                        c6785ju2.A.p(c6785ju2.B, null, null, true, -1.0f);
                    }
                    ViewOnClickListenerC9876su2 viewOnClickListenerC9876su24 = c6785ju2.z;
                    BinderC2640Ui0 binderC2640Ui0 = viewOnClickListenerC9876su24.l;
                    C6441iu2 c6441iu22 = c6785ju2.B;
                    Uri uri = c6441iu22.a;
                    int i4 = c6441iu22.h;
                    boolean z = viewOnClickListenerC9876su24.x;
                    binderC2640Ui0.getClass();
                    Object obj = ThreadUtils.a;
                    C2250Ri0 c2250Ri0 = new C2250Ri0(uri, i3, z, i4, true, c6785ju2);
                    PriorityQueue priorityQueue = binderC2640Ui0.v;
                    priorityQueue.add(c2250Ri0);
                    if (i4 == 3 && binderC2640Ui0.p) {
                        priorityQueue.add(new C2250Ri0(uri, i3, z, i4, false, c2250Ri0.g));
                    }
                    if (binderC2640Ui0.q == null) {
                        binderC2640Ui0.h();
                    }
                    c = 2;
                }
            }
            if (c == 1) {
                this.j++;
            } else if (c == 2) {
                this.k++;
            }
        }
    }

    @Override // defpackage.AbstractC8305oK2
    public final int q() {
        return this.i.i.size();
    }
}
