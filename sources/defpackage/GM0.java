package defpackage;

import java.io.File;
import java.util.Locale;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class GM0 extends AbstractC0185Bl {
    public final /* synthetic */ HM0 h;

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        HM0 hm0 = this.h;
        File file = hm0.c;
        boolean exists = file.exists();
        hm0.e.getClass();
        EI2.b("Tabs.PersistedTabData.Storage.Exists.File", exists);
        if (!exists) {
            return null;
        }
        boolean delete = file.delete();
        EI2.b("Tabs.PersistedTabData.Storage.Delete.File", delete);
        if (delete) {
            return null;
        }
        AbstractC4851eH1.a("FilePTDS", String.format(Locale.ENGLISH, "Error deleting file %s", file), new Object[0]);
        return null;
    }

    public GM0(HM0 hm0) {
        this.h = hm0;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: FM0
            @Override // java.lang.Runnable
            public final void run() {
                GM0.this.h.d.onResult(1);
            }
        });
        this.h.e.k();
    }
}
