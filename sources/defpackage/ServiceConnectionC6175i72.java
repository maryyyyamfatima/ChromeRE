package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: i72, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC6175i72 implements Handler.Callback, ServiceConnection {
    public final Context a;
    public final Handler g;
    public final HashMap h = new HashMap();
    public HashSet i = new HashSet();

    public ServiceConnectionC6175i72(Context context) {
        this.a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.g = new Handler(handlerThread.getLooper(), this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        InterfaceC7376le1 interfaceC7376le1 = null;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    C5831h72 c5831h72 = (C5831h72) this.h.get((ComponentName) message.obj);
                    if (c5831h72 != null) {
                        a(c5831h72);
                    }
                    return true;
                }
                C5831h72 c5831h722 = (C5831h72) this.h.get((ComponentName) message.obj);
                if (c5831h722 != null) {
                    if (c5831h722.b) {
                        this.a.unbindService(this);
                        c5831h722.b = false;
                    }
                    c5831h722.c = null;
                }
                return true;
            }
            C5487g72 c5487g72 = (C5487g72) message.obj;
            ComponentName componentName = c5487g72.a;
            IBinder iBinder = c5487g72.b;
            C5831h72 c5831h723 = (C5831h72) this.h.get(componentName);
            if (c5831h723 != null) {
                int i2 = AbstractBinderC7032ke1.a;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC7376le1)) {
                        interfaceC7376le1 = (InterfaceC7376le1) queryLocalInterface;
                    } else {
                        interfaceC7376le1 = new C6688je1(iBinder);
                    }
                }
                c5831h723.c = interfaceC7376le1;
                c5831h723.e = 0;
                a(c5831h723);
            }
            return true;
        }
        InterfaceC6517j72 interfaceC6517j72 = (InterfaceC6517j72) message.obj;
        String string = Settings.Secure.getString(this.a.getContentResolver(), "enabled_notification_listeners");
        synchronized (C6861k72.c) {
            if (string != null) {
                try {
                    if (!string.equals(C6861k72.d)) {
                        String[] split = string.split(":", -1);
                        HashSet hashSet2 = new HashSet(split.length);
                        for (String str : split) {
                            ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                            if (unflattenFromString != null) {
                                hashSet2.add(unflattenFromString.getPackageName());
                            }
                        }
                        C6861k72.e = hashSet2;
                        C6861k72.d = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            hashSet = C6861k72.e;
        }
        if (!hashSet.equals(this.i)) {
            this.i = hashSet;
            List<ResolveInfo> queryIntentServices = this.a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet hashSet3 = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName2 = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName2 + ", not adding listener record.");
                    } else {
                        hashSet3.add(componentName2);
                    }
                }
            }
            Iterator it = hashSet3.iterator();
            while (it.hasNext()) {
                ComponentName componentName3 = (ComponentName) it.next();
                if (!this.h.containsKey(componentName3)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Objects.toString(componentName3);
                    }
                    this.h.put(componentName3, new C5831h72(componentName3));
                }
            }
            Iterator it2 = this.h.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet3.contains(entry.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Objects.toString(entry.getKey());
                    }
                    C5831h72 c5831h724 = (C5831h72) entry.getValue();
                    if (c5831h724.b) {
                        this.a.unbindService(this);
                        c5831h724.b = false;
                    }
                    c5831h724.c = null;
                    it2.remove();
                }
            }
        }
        for (C5831h72 c5831h725 : this.h.values()) {
            c5831h725.d.add(interfaceC6517j72);
            a(c5831h725);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.g.obtainMessage(1, new C5487g72(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.g.obtainMessage(2, componentName).sendToTarget();
    }

    public final void b(C5831h72 c5831h72) {
        Handler handler = this.g;
        ComponentName componentName = c5831h72.a;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = c5831h72.e + 1;
        c5831h72.e = i;
        if (i > 6) {
            StringBuilder sb = new StringBuilder("Giving up on delivering ");
            ArrayDeque arrayDeque = c5831h72.d;
            sb.append(arrayDeque.size());
            sb.append(" tasks to ");
            sb.append(componentName);
            sb.append(" after ");
            sb.append(c5831h72.e);
            sb.append(" retries");
            Log.w("NotifManCompat", sb.toString());
            arrayDeque.clear();
            return;
        }
        handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (1 << (i - 1)) * 1000);
    }

    public final void a(C5831h72 c5831h72) {
        boolean z;
        boolean isLoggable = Log.isLoggable("NotifManCompat", 3);
        ComponentName componentName = c5831h72.a;
        ArrayDeque arrayDeque = c5831h72.d;
        if (isLoggable) {
            Objects.toString(componentName);
            arrayDeque.size();
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (c5831h72.b) {
            z = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.a;
            boolean bindService = context.bindService(component, this, 33);
            c5831h72.b = bindService;
            if (bindService) {
                c5831h72.e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z = c5831h72.b;
        }
        if (!z || c5831h72.c == null) {
            b(c5831h72);
            return;
        }
        while (true) {
            InterfaceC6517j72 interfaceC6517j72 = (InterfaceC6517j72) arrayDeque.peek();
            if (interfaceC6517j72 == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    interfaceC6517j72.toString();
                }
                ((C5143f72) interfaceC6517j72).a(c5831h72.c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Objects.toString(componentName);
                }
            } catch (RemoteException e) {
                Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(c5831h72);
    }
}
