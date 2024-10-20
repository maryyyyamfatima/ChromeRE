package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import defpackage.AbstractBinderC8046nb1;
import defpackage.C4632df0;
import defpackage.C7702mb1;
import defpackage.InterfaceC8733pb1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class CustomTabsSessionToken {
    public final InterfaceC8733pb1 a;
    public final PendingIntent b;
    public final C4632df0 c;

    public static CustomTabsSessionToken b(Intent intent) {
        Bundle extras = intent.getExtras();
        InterfaceC8733pb1 interfaceC8733pb1 = null;
        if (extras == null) {
            return null;
        }
        IBinder binder = extras.getBinder("android.support.customtabs.extra.SESSION");
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("android.support.customtabs.extra.SESSION_ID");
        if (binder == null && pendingIntent == null) {
            return null;
        }
        if (binder != null) {
            int i = AbstractBinderC8046nb1.a;
            IInterface queryLocalInterface = binder.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC8733pb1)) {
                interfaceC8733pb1 = (InterfaceC8733pb1) queryLocalInterface;
            } else {
                interfaceC8733pb1 = new C7702mb1(binder);
            }
        }
        return new CustomTabsSessionToken(interfaceC8733pb1, pendingIntent);
    }

    public CustomTabsSessionToken(InterfaceC8733pb1 interfaceC8733pb1, PendingIntent pendingIntent) {
        if (interfaceC8733pb1 == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.a = interfaceC8733pb1;
        this.b = pendingIntent;
        this.c = interfaceC8733pb1 == null ? null : new C4632df0(this);
    }

    public final IBinder a() {
        InterfaceC8733pb1 interfaceC8733pb1 = this.a;
        if (interfaceC8733pb1 != null) {
            return ((C7702mb1) interfaceC8733pb1).a;
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }

    public final int hashCode() {
        PendingIntent pendingIntent = this.b;
        return pendingIntent != null ? pendingIntent.hashCode() : a().hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CustomTabsSessionToken)) {
            return false;
        }
        CustomTabsSessionToken customTabsSessionToken = (CustomTabsSessionToken) obj;
        PendingIntent pendingIntent = customTabsSessionToken.b;
        PendingIntent pendingIntent2 = this.b;
        if ((pendingIntent2 == null) != (pendingIntent == null)) {
            return false;
        }
        if (pendingIntent2 != null) {
            return pendingIntent2.equals(pendingIntent);
        }
        return a().equals(customTabsSessionToken.a());
    }
}
