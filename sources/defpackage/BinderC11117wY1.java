package defpackage;

import android.database.CursorIndexOutOfBoundsException;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wY1 */
/* loaded from: classes.dex */
public final class BinderC11117wY1 extends AbstractBinderC7826mw {
    public final C6905kF3 a;
    public final String g;

    public BinderC11117wY1(C6905kF3 c6905kF3) {
        super("com.google.android.gms.chromesync.firstparty.internal.IListPasswordsResultCallback");
        this.a = c6905kF3;
        this.g = "value";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractBinderC7826mw
    public final boolean f1(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) AbstractC11786yV.a(parcel, Status.CREATOR);
        DataHolder dataHolder = (DataHolder) AbstractC11786yV.a(parcel, DataHolder.CREATOR);
        AbstractBinderC7826mw.g1(parcel);
        boolean r1 = status.r1();
        C6905kF3 c6905kF3 = this.a;
        if (!r1) {
            c6905kF3.a(AbstractC10800vd.a(status));
        } else if (dataHolder == null) {
            c6905kF3.a(AbstractC10800vd.a(Status.m));
        } else {
            try {
                OL2 h1 = h1(dataHolder, this.g);
                C8955qD1 c8955qD1 = (C8955qD1) C9297rD1.k.j();
                if (c8955qD1.h) {
                    c8955qD1.l();
                    c8955qD1.h = false;
                }
                C9297rD1 c9297rD1 = (C9297rD1) c8955qD1.g;
                InterfaceC1377Kp1 interfaceC1377Kp1 = c9297rD1.j;
                if (!((AbstractC7504m0) interfaceC1377Kp1).a) {
                    c9297rD1.j = QX0.r(interfaceC1377Kp1);
                }
                List list = c9297rD1.j;
                Charset charset = AbstractC1507Lp1.a;
                h1.getClass();
                if (h1 instanceof InterfaceC6812jz1) {
                    List e = ((InterfaceC6812jz1) h1).e();
                    InterfaceC6812jz1 interfaceC6812jz1 = (InterfaceC6812jz1) list;
                    int size = list.size();
                    for (Object obj : e) {
                        if (obj == null) {
                            String a = AbstractC9307rF1.a("Element at index ", interfaceC6812jz1.size() - size, " is null.");
                            int size2 = interfaceC6812jz1.size();
                            while (true) {
                                size2--;
                                if (size2 < size) {
                                    break;
                                }
                                interfaceC6812jz1.remove(size2);
                            }
                            throw new NullPointerException(a);
                        }
                        if (obj instanceof AbstractC4147cE) {
                            interfaceC6812jz1.h((AbstractC4147cE) obj);
                        } else {
                            interfaceC6812jz1.add((String) obj);
                        }
                    }
                } else if (!(h1 instanceof InterfaceC2337Rz2)) {
                    if (list instanceof ArrayList) {
                        ((ArrayList) list).ensureCapacity(h1.i + list.size());
                    }
                    int size3 = list.size();
                    C0172Bi1 listIterator = h1.listIterator(0);
                    while (listIterator.hasNext()) {
                        Object next = listIterator.next();
                        if (next == null) {
                            String a2 = AbstractC9307rF1.a("Element at index ", list.size() - size3, " is null.");
                            int size4 = list.size();
                            while (true) {
                                size4--;
                                if (size4 < size3) {
                                    break;
                                }
                                list.remove(size4);
                            }
                            throw new NullPointerException(a2);
                        }
                        list.add(next);
                    }
                } else {
                    list.addAll(h1);
                }
                c6905kF3.b((C9297rD1) c8955qD1.j());
                dataHolder.close();
            } catch (C1127Ir1 unused) {
                c6905kF3.a(AbstractC10800vd.a(Status.m));
            }
        }
        return true;
    }

    public static OL2 h1(DataHolder dataHolder, String str) {
        int[] iArr;
        boolean z;
        C0172Bi1 c0172Bi1 = AbstractC0562Ei1.g;
        RV.b(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i = 0;
        int i2 = 0;
        while (i < dataHolder.m) {
            int i3 = 0;
            while (true) {
                iArr = dataHolder.l;
                if (i3 >= iArr.length) {
                    break;
                }
                if (i < iArr[i3]) {
                    i3--;
                    break;
                }
                i3++;
            }
            if (i3 == iArr.length) {
                i3--;
            }
            Bundle bundle = dataHolder.h;
            if (bundle == null || !bundle.containsKey(str)) {
                throw new IllegalArgumentException(AbstractC4809e90.a("No such column: ", str));
            }
            synchronized (dataHolder) {
                z = dataHolder.n;
            }
            if (z) {
                throw new IllegalArgumentException("Buffer is closed.");
            }
            if (i < 0 || i >= dataHolder.m) {
                throw new CursorIndexOutOfBoundsException(i, dataHolder.m);
            }
            byte[] blob = dataHolder.i[i3].getBlob(i, dataHolder.h.getInt(str));
            XF0 d = XF0.d();
            C2017Pn2 c2017Pn2 = C2017Pn2.j;
            int length = blob.length;
            C2017Pn2 c2017Pn22 = new C2017Pn2();
            try {
                C7931nE2 c7931nE2 = C7931nE2.c;
                c7931nE2.getClass();
                QW2 b = c7931nE2.b(c2017Pn22.getClass());
                b.f(c2017Pn22, blob, 0, length + 0, new C2254Rj(d));
                b.b(c2017Pn22);
                if (c2017Pn22.a != 0) {
                    throw new RuntimeException();
                }
                QX0.i(c2017Pn22);
                int i4 = i2 + 1;
                if (objArr.length < i4) {
                    objArr = Arrays.copyOf(objArr, AbstractC11518xi1.b(objArr.length, i4));
                }
                objArr[i2] = c2017Pn22;
                i++;
                i2 = i4;
            } catch (C1127Ir1 e) {
                if (e.g) {
                    throw new C1127Ir1(e);
                }
                throw e;
            } catch (IOException e2) {
                if (e2.getCause() instanceof C1127Ir1) {
                    throw ((C1127Ir1) e2.getCause());
                }
                throw new C1127Ir1(e2);
            } catch (IndexOutOfBoundsException unused) {
                throw C1127Ir1.h();
            } catch (C6827k14 e3) {
                throw e3.a();
            }
        }
        return AbstractC0562Ei1.m(i2, objArr);
    }
}
