package defpackage;

import android.os.Trace;
import com.bumptech.glide.a;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ML2 implements InterfaceC5444g01 {
    public boolean a;
    public final /* synthetic */ a b;
    public final /* synthetic */ List c;
    public final /* synthetic */ AbstractC7392lh d;

    public ML2(a aVar, List list, AbstractC7392lh abstractC7392lh) {
        this.b = aVar;
        this.c = list;
        this.d = abstractC7392lh;
    }

    @Override // defpackage.InterfaceC5444g01
    public final Object get() {
        if (this.a) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        this.a = true;
        Trace.beginSection("Glide registry");
        try {
            return NL2.a(this.b, this.c, this.d);
        } finally {
            Trace.endSection();
        }
    }
}
