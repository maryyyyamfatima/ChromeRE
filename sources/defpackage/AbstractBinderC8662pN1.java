package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.lang.ref.WeakReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pN1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC8662pN1 extends Binder implements InterfaceC12174zd1 {
    public final WeakReference a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC8662pN1(AbstractC9005qN1 abstractC9005qN1) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.a = new WeakReference(abstractC9005qN1);
    }

    @Override // android.os.Binder
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        WeakReference weakReference = this.a;
        switch (i) {
            case 1:
                String readString = parcel.readString();
                Bundle bundle = (Bundle) AbstractC11831yd1.a(parcel, Bundle.CREATOR);
                AbstractC9005qN1 abstractC9005qN1 = (AbstractC9005qN1) weakReference.get();
                if (abstractC9005qN1 != null) {
                    abstractC9005qN1.d(1, readString, bundle);
                }
                return true;
            case 2:
                j0();
                return true;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                b1((PlaybackStateCompat) AbstractC11831yd1.a(parcel, PlaybackStateCompat.CREATOR));
                return true;
            case 4:
                l0((MediaMetadataCompat) AbstractC11831yd1.a(parcel, MediaMetadataCompat.CREATOR));
                return true;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                I(parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR));
                return true;
            case 6:
                g0((CharSequence) AbstractC11831yd1.a(parcel, TextUtils.CHAR_SEQUENCE_CREATOR));
                return true;
            case 7:
                F((Bundle) AbstractC11831yd1.a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                e1((ParcelableVolumeInfo) AbstractC11831yd1.a(parcel, ParcelableVolumeInfo.CREATOR));
                return true;
            case 9:
                int readInt = parcel.readInt();
                AbstractC9005qN1 abstractC9005qN12 = (AbstractC9005qN1) weakReference.get();
                if (abstractC9005qN12 != null) {
                    abstractC9005qN12.d(9, Integer.valueOf(readInt), null);
                }
                return true;
            case 10:
                parcel.readInt();
                return true;
            case 11:
                boolean z = parcel.readInt() != 0;
                AbstractC9005qN1 abstractC9005qN13 = (AbstractC9005qN1) weakReference.get();
                if (abstractC9005qN13 != null) {
                    abstractC9005qN13.d(11, Boolean.valueOf(z), null);
                }
                return true;
            case 12:
                int readInt2 = parcel.readInt();
                AbstractC9005qN1 abstractC9005qN14 = (AbstractC9005qN1) weakReference.get();
                if (abstractC9005qN14 != null) {
                    abstractC9005qN14.d(12, Integer.valueOf(readInt2), null);
                }
                return true;
            case 13:
                AbstractC9005qN1 abstractC9005qN15 = (AbstractC9005qN1) weakReference.get();
                if (abstractC9005qN15 != null) {
                    abstractC9005qN15.d(13, null, null);
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // defpackage.InterfaceC12174zd1
    public final void b1(PlaybackStateCompat playbackStateCompat) {
        AbstractC9005qN1 abstractC9005qN1 = (AbstractC9005qN1) this.a.get();
        if (abstractC9005qN1 != null) {
            abstractC9005qN1.d(2, playbackStateCompat, null);
        }
    }
}
