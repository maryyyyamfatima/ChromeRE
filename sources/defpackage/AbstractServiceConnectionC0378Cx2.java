package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.browser.customtabs.CustomTabsSessionToken;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Cx2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceConnectionC0378Cx2 implements ServiceConnection {
    public final Object a = new Object();
    public final InterfaceC8733pb1 g;
    public InterfaceC2491Te1 h;
    public String i;
    public boolean j;

    public AbstractServiceConnectionC0378Cx2(CustomTabsSessionToken customTabsSessionToken) {
        InterfaceC8733pb1 c7702mb1;
        InterfaceC8733pb1 interfaceC8733pb1 = customTabsSessionToken.a;
        IBinder iBinder = interfaceC8733pb1 == null ? null : ((C7702mb1) interfaceC8733pb1).a;
        if (iBinder == null) {
            throw new IllegalArgumentException("Provided session must have binder.");
        }
        int i = AbstractBinderC8046nb1.a;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
        if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC8733pb1)) {
            c7702mb1 = (InterfaceC8733pb1) queryLocalInterface;
        } else {
            c7702mb1 = new C7702mb1(iBinder);
        }
        this.g = c7702mb1;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC2491Te1 c2231Re1;
        int i = AbstractBinderC2361Se1.a;
        if (iBinder == null) {
            c2231Re1 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.IPostMessageService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC2491Te1)) {
                c2231Re1 = (InterfaceC2491Te1) queryLocalInterface;
            } else {
                c2231Re1 = new C2231Re1(iBinder);
            }
        }
        this.h = c2231Re1;
        if (!this.j || c2231Re1 == null) {
            return;
        }
        synchronized (this.a) {
            try {
                this.h.Y0(this.g, null);
            } catch (RemoteException unused) {
            } finally {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.h = null;
    }
}
