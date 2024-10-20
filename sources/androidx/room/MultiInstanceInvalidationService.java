package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.AbstractC0087Ar1;
import defpackage.FZ1;
import defpackage.GZ1;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {
    public int a;
    public final LinkedHashMap g = new LinkedHashMap();
    public final GZ1 h = new GZ1(this);
    public final FZ1 i = new FZ1(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        AbstractC0087Ar1.e(intent, "intent");
        return this.i;
    }
}
