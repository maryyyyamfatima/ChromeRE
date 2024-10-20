package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fP2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5236fP2 implements InterfaceC8030nY1 {
    public final InterfaceC8030nY1 a;
    public final Resources b;

    @Override // defpackage.InterfaceC8030nY1
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // defpackage.InterfaceC8030nY1
    public final C7686mY1 b(Object obj, int i, int i2, C0543Ee2 c0543Ee2) {
        Uri uri;
        Integer num = (Integer) obj;
        Resources resources = this.b;
        try {
            uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num.intValue()) + "/" + resources.getResourceTypeName(num.intValue()) + "/" + resources.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num, e);
            }
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.a.b(uri, i, i2, c0543Ee2);
    }

    public C5236fP2(Resources resources, InterfaceC8030nY1 interfaceC8030nY1) {
        this.b = resources;
        this.a = interfaceC8030nY1;
    }
}
