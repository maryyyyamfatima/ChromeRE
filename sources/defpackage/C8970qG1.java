package defpackage;

import android.location.Location;
import com.google.android.gms.location.LocationResult;
import java.util.List;
import org.chromium.device.geolocation.LocationProviderAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qG1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8970qG1 implements ZD1 {
    public final /* synthetic */ LocationResult a;

    @Override // defpackage.ZD1
    public final void b() {
    }

    public C8970qG1(LocationResult locationResult) {
        this.a = locationResult;
    }

    @Override // defpackage.ZD1
    public final void a(Object obj) {
        LocationResult locationResult = this.a;
        if (locationResult == null) {
            return;
        }
        List list = locationResult.a;
        int size = list.size();
        LocationProviderAdapter.b(size == 0 ? null : (Location) list.get(size - 1));
    }
}
