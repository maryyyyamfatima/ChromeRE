package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.versionedparcelable.ParcelImpl;
import defpackage.AbstractC2512Ti2;
import defpackage.AbstractC9005qN1;
import defpackage.BinderC9347rN1;
import defpackage.C0537Ed1;
import defpackage.H84;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class c {
    public final MediaController a;
    public final Object b = new Object();
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public final MediaSessionCompat$Token e;

    public c(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.e = mediaSessionCompat$Token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) mediaSessionCompat$Token.g);
        this.a = mediaController;
        if (mediaSessionCompat$Token.a() == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ResultReceiver(this) { // from class: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver
                public final WeakReference a;

                {
                    super(null);
                    this.a = new WeakReference(this);
                }

                @Override // android.os.ResultReceiver
                public final void onReceiveResult(int i, Bundle bundle) {
                    b c0537Ed1;
                    c cVar = (c) this.a.get();
                    if (cVar == null || bundle == null) {
                        return;
                    }
                    synchronized (cVar.b) {
                        MediaSessionCompat$Token mediaSessionCompat$Token2 = cVar.e;
                        IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
                        int i2 = a.a;
                        H84 h84 = null;
                        if (binder == null) {
                            c0537Ed1 = null;
                        } else {
                            IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                            if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                                c0537Ed1 = (b) queryLocalInterface;
                            } else {
                                c0537Ed1 = new C0537Ed1(binder);
                            }
                        }
                        synchronized (mediaSessionCompat$Token2.a) {
                            mediaSessionCompat$Token2.h = c0537Ed1;
                        }
                        MediaSessionCompat$Token mediaSessionCompat$Token3 = cVar.e;
                        try {
                            Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
                            if (bundle2 != null) {
                                bundle2.setClassLoader(AbstractC2512Ti2.class.getClassLoader());
                                Parcelable parcelable = bundle2.getParcelable("a");
                                if (parcelable instanceof ParcelImpl) {
                                    h84 = ((ParcelImpl) parcelable).a;
                                } else {
                                    throw new IllegalArgumentException("Invalid parcel");
                                }
                            }
                        } catch (RuntimeException unused) {
                        }
                        synchronized (mediaSessionCompat$Token3.a) {
                            mediaSessionCompat$Token3.i = h84;
                        }
                        cVar.a();
                    }
                }
            });
        }
    }

    public final void b(AbstractC9005qN1 abstractC9005qN1) {
        this.a.unregisterCallback(abstractC9005qN1.a);
        synchronized (this.b) {
            if (this.e.a() != null) {
                try {
                    BinderC9347rN1 binderC9347rN1 = (BinderC9347rN1) this.d.remove(abstractC9005qN1);
                    if (binderC9347rN1 != null) {
                        abstractC9005qN1.c = null;
                        this.e.a().x0(binderC9347rN1);
                    }
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e);
                }
            } else {
                this.c.remove(abstractC9005qN1);
            }
        }
    }

    public final void a() {
        MediaSessionCompat$Token mediaSessionCompat$Token = this.e;
        if (mediaSessionCompat$Token.a() == null) {
            return;
        }
        ArrayList arrayList = this.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC9005qN1 abstractC9005qN1 = (AbstractC9005qN1) it.next();
            BinderC9347rN1 binderC9347rN1 = new BinderC9347rN1(abstractC9005qN1);
            this.d.put(abstractC9005qN1, binderC9347rN1);
            abstractC9005qN1.c = binderC9347rN1;
            try {
                mediaSessionCompat$Token.a().K0(binderC9347rN1);
                abstractC9005qN1.d(13, null, null);
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
            }
        }
        arrayList.clear();
    }
}
