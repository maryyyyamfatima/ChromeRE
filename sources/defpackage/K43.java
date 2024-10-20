package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class K43 extends AbstractBinderC7826mw {
    public final J43 a;
    public final Class g;

    public K43(J43 j43) {
        super("com.google.android.gms.cast.framework.ISessionManagerListener");
        this.a = j43;
        this.g = QH.class;
    }

    @Override // defpackage.AbstractBinderC7826mw
    public final boolean f1(int i, Parcel parcel, Parcel parcel2) {
        Class cls = this.g;
        InterfaceC9436re1 interfaceC9436re1 = null;
        J43 j43 = this.a;
        switch (i) {
            case 1:
                ObjectWrapper objectWrapper = new ObjectWrapper(j43);
                parcel2.writeNoException();
                AbstractC11786yV.c(parcel2, objectWrapper);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(AbstractBinderC8751pe1.DESCRIPTOR);
                    interfaceC9436re1 = queryLocalInterface instanceof InterfaceC9436re1 ? (InterfaceC9436re1) queryLocalInterface : new C8408oe1(readStrongBinder);
                }
                AbstractBinderC7826mw.g1(parcel);
                E43 e43 = (E43) ObjectWrapper.h1(interfaceC9436re1);
                if (cls.isInstance(e43) && j43 != null) {
                    j43.k((E43) cls.cast(e43));
                }
                parcel2.writeNoException();
                return true;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(AbstractBinderC8751pe1.DESCRIPTOR);
                    interfaceC9436re1 = queryLocalInterface2 instanceof InterfaceC9436re1 ? (InterfaceC9436re1) queryLocalInterface2 : new C8408oe1(readStrongBinder2);
                }
                String readString = parcel.readString();
                AbstractBinderC7826mw.g1(parcel);
                E43 e432 = (E43) ObjectWrapper.h1(interfaceC9436re1);
                if (cls.isInstance(e432) && j43 != null) {
                    j43.j((E43) cls.cast(e432), readString);
                }
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface(AbstractBinderC8751pe1.DESCRIPTOR);
                    interfaceC9436re1 = queryLocalInterface3 instanceof InterfaceC9436re1 ? (InterfaceC9436re1) queryLocalInterface3 : new C8408oe1(readStrongBinder3);
                }
                int readInt = parcel.readInt();
                AbstractBinderC7826mw.g1(parcel);
                E43 e433 = (E43) ObjectWrapper.h1(interfaceC9436re1);
                if (cls.isInstance(e433) && j43 != null) {
                    j43.a((E43) cls.cast(e433), readInt);
                }
                parcel2.writeNoException();
                return true;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface(AbstractBinderC8751pe1.DESCRIPTOR);
                    interfaceC9436re1 = queryLocalInterface4 instanceof InterfaceC9436re1 ? (InterfaceC9436re1) queryLocalInterface4 : new C8408oe1(readStrongBinder4);
                }
                AbstractBinderC7826mw.g1(parcel);
                E43 e434 = (E43) ObjectWrapper.h1(interfaceC9436re1);
                if (cls.isInstance(e434) && j43 != null) {
                    j43.f((E43) cls.cast(e434));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface(AbstractBinderC8751pe1.DESCRIPTOR);
                    interfaceC9436re1 = queryLocalInterface5 instanceof InterfaceC9436re1 ? (InterfaceC9436re1) queryLocalInterface5 : new C8408oe1(readStrongBinder5);
                }
                int readInt2 = parcel.readInt();
                AbstractBinderC7826mw.g1(parcel);
                E43 e435 = (E43) ObjectWrapper.h1(interfaceC9436re1);
                if (cls.isInstance(e435) && j43 != null) {
                    j43.d((E43) cls.cast(e435), readInt2);
                }
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface(AbstractBinderC8751pe1.DESCRIPTOR);
                    interfaceC9436re1 = queryLocalInterface6 instanceof InterfaceC9436re1 ? (InterfaceC9436re1) queryLocalInterface6 : new C8408oe1(readStrongBinder6);
                }
                String readString2 = parcel.readString();
                AbstractBinderC7826mw.g1(parcel);
                E43 e436 = (E43) ObjectWrapper.h1(interfaceC9436re1);
                if (cls.isInstance(e436) && j43 != null) {
                    j43.l((E43) cls.cast(e436), readString2);
                }
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface(AbstractBinderC8751pe1.DESCRIPTOR);
                    interfaceC9436re1 = queryLocalInterface7 instanceof InterfaceC9436re1 ? (InterfaceC9436re1) queryLocalInterface7 : new C8408oe1(readStrongBinder7);
                }
                ClassLoader classLoader = AbstractC11786yV.a;
                boolean z = parcel.readInt() != 0;
                AbstractBinderC7826mw.g1(parcel);
                E43 e437 = (E43) ObjectWrapper.h1(interfaceC9436re1);
                if (cls.isInstance(e437) && j43 != null) {
                    j43.i((E43) cls.cast(e437), z);
                }
                parcel2.writeNoException();
                return true;
            case 9:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface(AbstractBinderC8751pe1.DESCRIPTOR);
                    interfaceC9436re1 = queryLocalInterface8 instanceof InterfaceC9436re1 ? (InterfaceC9436re1) queryLocalInterface8 : new C8408oe1(readStrongBinder8);
                }
                int readInt3 = parcel.readInt();
                AbstractBinderC7826mw.g1(parcel);
                E43 e438 = (E43) ObjectWrapper.h1(interfaceC9436re1);
                if (cls.isInstance(e438) && j43 != null) {
                    j43.g((E43) cls.cast(e438), readInt3);
                }
                parcel2.writeNoException();
                return true;
            case 10:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface(AbstractBinderC8751pe1.DESCRIPTOR);
                    interfaceC9436re1 = queryLocalInterface9 instanceof InterfaceC9436re1 ? (InterfaceC9436re1) queryLocalInterface9 : new C8408oe1(readStrongBinder9);
                }
                int readInt4 = parcel.readInt();
                AbstractBinderC7826mw.g1(parcel);
                E43 e439 = (E43) ObjectWrapper.h1(interfaceC9436re1);
                if (cls.isInstance(e439) && j43 != null) {
                    j43.m((E43) cls.cast(e439), readInt4);
                }
                parcel2.writeNoException();
                return true;
            case 11:
                parcel2.writeNoException();
                parcel2.writeInt(222980000);
                return true;
            default:
                return false;
        }
    }
}
