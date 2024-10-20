package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import defpackage.AbstractC0667Fd1;
import defpackage.C11488xd1;
import defpackage.InterfaceC12174zd1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class a extends Binder implements b {
    public static final /* synthetic */ int a = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public a() {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        InterfaceC12174zd1 interfaceC12174zd1 = null;
        switch (i) {
            case 1:
                E0(parcel.readString(), (Bundle) AbstractC0667Fd1.a(parcel, Bundle.CREATOR), (MediaSessionCompat$ResultReceiverWrapper) AbstractC0667Fd1.a(parcel, MediaSessionCompat$ResultReceiverWrapper.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                boolean d0 = d0((KeyEvent) AbstractC0667Fd1.a(parcel, KeyEvent.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(d0 ? 1 : 0);
                return true;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC12174zd1)) {
                        interfaceC12174zd1 = (InterfaceC12174zd1) queryLocalInterface;
                    } else {
                        interfaceC12174zd1 = new C11488xd1(readStrongBinder);
                    }
                }
                K0(interfaceC12174zd1);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof InterfaceC12174zd1)) {
                        interfaceC12174zd1 = (InterfaceC12174zd1) queryLocalInterface2;
                    } else {
                        interfaceC12174zd1 = new C11488xd1(readStrongBinder2);
                    }
                }
                x0(interfaceC12174zd1);
                parcel2.writeNoException();
                return true;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                boolean t = t();
                parcel2.writeNoException();
                parcel2.writeInt(t ? 1 : 0);
                return true;
            case 6:
                String Z0 = Z0();
                parcel2.writeNoException();
                parcel2.writeString(Z0);
                return true;
            case 7:
                String tag = getTag();
                parcel2.writeNoException();
                parcel2.writeString(tag);
                return true;
            case 8:
                PendingIntent w = w();
                parcel2.writeNoException();
                AbstractC0667Fd1.b(parcel2, w);
                return true;
            case 9:
                long g = g();
                parcel2.writeNoException();
                parcel2.writeLong(g);
                return true;
            case 10:
                ParcelableVolumeInfo Q0 = Q0();
                parcel2.writeNoException();
                AbstractC0667Fd1.b(parcel2, Q0);
                return true;
            case 11:
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                parcel.readString();
                J(readInt, readInt2);
                parcel2.writeNoException();
                return true;
            case 12:
                int readInt3 = parcel.readInt();
                int readInt4 = parcel.readInt();
                parcel.readString();
                U(readInt3, readInt4);
                parcel2.writeNoException();
                return true;
            case 13:
                f();
                parcel2.writeNoException();
                return true;
            case 14:
                Q(parcel.readString(), (Bundle) AbstractC0667Fd1.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                S(parcel.readString(), (Bundle) AbstractC0667Fd1.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                W((Uri) AbstractC0667Fd1.a(parcel, Uri.CREATOR), (Bundle) AbstractC0667Fd1.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                P0(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 18:
                pause();
                parcel2.writeNoException();
                return true;
            case 19:
                stop();
                parcel2.writeNoException();
                return true;
            case 20:
                next();
                parcel2.writeNoException();
                return true;
            case 21:
                previous();
                parcel2.writeNoException();
                return true;
            case 22:
                V();
                parcel2.writeNoException();
                return true;
            case 23:
                J0();
                parcel2.writeNoException();
                return true;
            case 24:
                X(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 25:
                q((RatingCompat) AbstractC0667Fd1.a(parcel, RatingCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 26:
                m(parcel.readString(), (Bundle) AbstractC0667Fd1.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 27:
                MediaMetadataCompat c = c();
                parcel2.writeNoException();
                AbstractC0667Fd1.b(parcel2, c);
                return true;
            case 28:
                PlaybackStateCompat d = d();
                parcel2.writeNoException();
                AbstractC0667Fd1.b(parcel2, d);
                return true;
            case 29:
                F0();
                parcel2.writeNoException();
                parcel2.writeTypedList(null);
                return true;
            case 30:
                CharSequence K = K();
                parcel2.writeNoException();
                if (K != null) {
                    parcel2.writeInt(1);
                    TextUtils.writeToParcel(K, parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 31:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                AbstractC0667Fd1.b(parcel2, extras);
                return true;
            case 32:
                z();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 33:
                E();
                parcel2.writeNoException();
                return true;
            case 34:
                M(parcel.readString(), (Bundle) AbstractC0667Fd1.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 35:
                B(parcel.readString(), (Bundle) AbstractC0667Fd1.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 36:
                r((Uri) AbstractC0667Fd1.a(parcel, Uri.CREATOR), (Bundle) AbstractC0667Fd1.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 37:
                N0();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 38:
                p();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 39:
                I0(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 40:
                parcel.readInt();
                u();
                parcel2.writeNoException();
                return true;
            case 41:
                v((MediaDescriptionCompat) AbstractC0667Fd1.a(parcel, MediaDescriptionCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 42:
                k0((MediaDescriptionCompat) AbstractC0667Fd1.a(parcel, MediaDescriptionCompat.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 43:
                s((MediaDescriptionCompat) AbstractC0667Fd1.a(parcel, MediaDescriptionCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 44:
                v0(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 45:
                w0();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 46:
                n0(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 47:
                u0();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 48:
                U0(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 49:
                c0(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 50:
                Bundle O = O();
                parcel2.writeNoException();
                AbstractC0667Fd1.b(parcel2, O);
                return true;
            case 51:
                i0((RatingCompat) AbstractC0667Fd1.a(parcel, RatingCompat.CREATOR), (Bundle) AbstractC0667Fd1.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
