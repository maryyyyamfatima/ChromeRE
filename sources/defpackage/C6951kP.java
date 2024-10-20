package defpackage;

import android.os.IBinder;
import android.os.Messenger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6951kP extends AbstractC1598Mh3 {
    @Override // defpackage.AbstractC1598Mh3
    public final IBinder a() {
        return new Messenger(new HandlerC6607jP(V60.a)).getBinder();
    }
}
