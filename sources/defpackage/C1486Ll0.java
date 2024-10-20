package defpackage;

import android.os.Build;
import android.util.Pair;
import java.util.Map;
import org.chromium.ui.base.DeviceFormFactor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ll0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1486Ll0 implements InterfaceC12080zL0 {
    @Override // defpackage.InterfaceC12080zL0
    public final /* synthetic */ Pair c() {
        return null;
    }

    @Override // defpackage.InterfaceC12080zL0
    public final Map d() {
        return AbstractC9048qW.c(Pair.create("device_name", Build.DEVICE), Pair.create("device_type", DeviceFormFactor.a(V60.a) ? "tablet" : "phone"));
    }
}
