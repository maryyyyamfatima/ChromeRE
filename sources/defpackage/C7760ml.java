package defpackage;

import android.util.SparseArray;
import org.chromium.base.TraceEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ml */
/* loaded from: classes2.dex */
public final class C7760ml extends AbstractC0185Bl {
    public final int h;
    public final /* synthetic */ AbstractC8448ol i;

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        int i = this.h;
        AbstractC8448ol abstractC8448ol = this.i;
        abstractC8448ol.getClass();
        try {
            TraceEvent.b("AsyncPreloadResourceLoader.createResource", null);
            return abstractC8448ol.d.a(i);
        } finally {
            TraceEvent.c("AsyncPreloadResourceLoader.createResource");
        }
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        IO2 io2 = (IO2) obj;
        AbstractC8448ol abstractC8448ol = this.i;
        SparseArray sparseArray = abstractC8448ol.c;
        int i = this.h;
        if (sparseArray.get(i) == null) {
            return;
        }
        abstractC8448ol.b(i, io2);
        abstractC8448ol.c.remove(i);
    }

    public C7760ml(AbstractC8448ol abstractC8448ol, int i) {
        this.i = abstractC8448ol;
        this.h = i;
    }
}
