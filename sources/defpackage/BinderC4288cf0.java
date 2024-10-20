package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.browser.customtabs.CustomTabsSessionToken;
import java.util.NoSuchElementException;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cf0 */
/* loaded from: classes.dex */
public final class BinderC4288cf0 extends AbstractBinderC9418rb1 {
    public final /* synthetic */ AbstractServiceC11514xh3 a;

    public BinderC4288cf0(AbstractServiceC11514xh3 abstractServiceC11514xh3) {
        this.a = abstractServiceC11514xh3;
    }

    public final boolean e(InterfaceC8733pb1 interfaceC8733pb1, PendingIntent pendingIntent) {
        final CustomTabsSessionToken customTabsSessionToken = new CustomTabsSessionToken(interfaceC8733pb1, pendingIntent);
        try {
            IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: bf0
                @Override // android.os.IBinder.DeathRecipient
                public final void binderDied() {
                    BinderC4288cf0 binderC4288cf0 = BinderC4288cf0.this;
                    final CustomTabsSessionToken customTabsSessionToken2 = customTabsSessionToken;
                    AbstractServiceC11514xh3 abstractServiceC11514xh3 = binderC4288cf0.a;
                    final CustomTabsConnection customTabsConnection = abstractServiceC11514xh3.i.a;
                    customTabsConnection.getClass();
                    PostTask.d(AbstractC5103f04.a, new Runnable() { // from class: Le0
                        @Override // java.lang.Runnable
                        public final void run() {
                            CustomTabsConnection customTabsConnection2 = CustomTabsConnection.this;
                            CustomTabsSessionToken customTabsSessionToken3 = customTabsSessionToken2;
                            EU eu = customTabsConnection2.c;
                            synchronized (eu) {
                                if ((customTabsSessionToken3.b != null) && eu.c.containsKey(customTabsSessionToken3)) {
                                    ((DU) eu.c.get(customTabsSessionToken3)).b = null;
                                } else {
                                    AU au = new AU(eu, customTabsSessionToken3);
                                    synchronized (eu) {
                                        DU du = (DU) eu.c.get(customTabsSessionToken3);
                                        if (du != null) {
                                            au.a(du);
                                        }
                                    }
                                }
                            }
                        }
                    });
                    try {
                        synchronized (abstractServiceC11514xh3.a) {
                            InterfaceC8733pb1 interfaceC8733pb12 = customTabsSessionToken2.a;
                            IBinder iBinder = interfaceC8733pb12 == null ? null : ((C7702mb1) interfaceC8733pb12).a;
                            if (iBinder == null) {
                                return;
                            }
                            iBinder.unlinkToDeath((IBinder.DeathRecipient) abstractServiceC11514xh3.a.get(iBinder), 0);
                            abstractServiceC11514xh3.a.remove(iBinder);
                        }
                    } catch (NoSuchElementException unused) {
                    }
                }
            };
            synchronized (this.a.a) {
                ((C7702mb1) interfaceC8733pb1).a.linkToDeath(deathRecipient, 0);
                this.a.a.put(((C7702mb1) interfaceC8733pb1).a, deathRecipient);
            }
            return this.a.i.a.o(customTabsSessionToken);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public static PendingIntent a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("android.support.customtabs.extra.SESSION_ID");
        bundle.remove("android.support.customtabs.extra.SESSION_ID");
        return pendingIntent;
    }
}
