package defpackage;

import android.os.Build;
import android.os.Environment;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mr0 */
/* loaded from: classes.dex */
public final class C7797mr0 extends AbstractC0185Bl {
    public final C8141nr0 h;
    public final /* synthetic */ C9513rr0 i;

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        C9513rr0 c9513rr0 = this.i;
        c9513rr0.d = (ArrayList) obj;
        c9513rr0.a = true;
        c9513rr0.b = false;
        ArrayList arrayList = c9513rr0.f;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Callback) it.next()).onResult(c9513rr0.d);
        }
        arrayList.clear();
        c9513rr0.c = null;
    }

    public C7797mr0(C9513rr0 c9513rr0, C8141nr0 c8141nr0) {
        this.i = c9513rr0;
        this.h = c8141nr0;
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        List<File> list;
        ArrayList arrayList = new ArrayList();
        this.h.getClass();
        File b = C9513rr0.b();
        if (b == null) {
            arrayList.add(new C0461Do0(0L, 2, null, 0L));
        } else {
            arrayList.add(new C0461Do0(b.getUsableSpace(), 0, b.getAbsolutePath(), b.getTotalSpace()));
            C9513rr0 c9513rr0 = this.i;
            c9513rr0.getClass();
            boolean z = false;
            EI2.h(0, 3, "MobileDownload.Location.DirectoryType");
            c9513rr0.e = Environment.getExternalStorageDirectory().getAbsolutePath();
            C9171qr0 a = C8141nr0.a();
            if (Build.VERSION.SDK_INT > 29) {
                list = a.a;
            } else {
                list = a.b;
            }
            if (!list.isEmpty()) {
                for (File file : list) {
                    if (file != null) {
                        arrayList.add(new C0461Do0(file.getUsableSpace(), 1, file.getAbsolutePath(), file.getTotalSpace()));
                        z = true;
                    }
                }
                if (z) {
                    EI2.h(1, 3, "MobileDownload.Location.DirectoryType");
                }
            }
        }
        return arrayList;
    }
}
