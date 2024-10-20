package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Iv0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1146Iv0 {
    public static Boolean b = null;
    public static InterfaceC1956Pb1 c = null;
    public static InterfaceC2346Sb1 d = null;
    public static String e = null;
    public static boolean f = false;
    public static int g = -1;
    public static Boolean h;
    public static final ThreadLocal i = new ThreadLocal();
    public static final C11595xv0 j = new C11595xv0();
    public static final C11938yv0 k = new C11938yv0();
    public static final C12281zv0 l = new C12281zv0();
    public static final C0106Av0 m = new C0106Av0();
    public static final C0236Bv0 n = new C0236Bv0();
    public final Context a;

    public static ClassLoader c() {
        ClassLoader classLoader;
        synchronized (AbstractC10909vv0.class) {
            if (AbstractC10909vv0.a == null) {
                AbstractC10909vv0.a = AbstractC10909vv0.b();
            }
            classLoader = AbstractC10909vv0.a;
        }
        if (classLoader != null) {
            return classLoader;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return new DelegateLastClassLoader(e, ClassLoader.getSystemClassLoader());
        }
        return new C11252wv0(ClassLoader.getSystemClassLoader(), e);
    }

    public static C1146Iv0 i(Context context, InterfaceC1016Hv0 interfaceC1016Hv0, String str) {
        ThreadLocal threadLocal = i;
        C0366Cv0 c0366Cv0 = (C0366Cv0) threadLocal.get();
        C0366Cv0 c0366Cv02 = new C0366Cv0();
        threadLocal.set(c0366Cv02);
        C11595xv0 c11595xv0 = j;
        long longValue = ((Long) c11595xv0.get()).longValue();
        try {
            c11595xv0.set(Long.valueOf(SystemClock.elapsedRealtime()));
            C0886Gv0 a = interfaceC1016Hv0.a(context, str, k);
            Log.i("DynamiteModule", "Considering local module " + str + ":" + a.a + " and remote module " + str + ":" + a.b);
            int i2 = a.c;
            if (i2 == 0 || ((i2 == -1 && a.a == 0) || (i2 == 1 && a.b == 0))) {
                throw new C0626Ev0("No acceptable module " + str + " found. Local version is " + a.a + " and remote version is " + a.b + ".");
            }
            if (i2 == -1) {
                C1146Iv0 j2 = j(context, str);
                if (longValue == 0) {
                    c11595xv0.remove();
                } else {
                    c11595xv0.set(Long.valueOf(longValue));
                }
                Cursor cursor = c0366Cv02.a;
                if (cursor != null) {
                    cursor.close();
                }
                threadLocal.set(c0366Cv0);
                return j2;
            }
            if (i2 != 1) {
                throw new C0626Ev0("VersionPolicy returned invalid code:" + a.c);
            }
            try {
                C1146Iv0 k2 = k(a.b, context, str);
                if (longValue == 0) {
                    c11595xv0.remove();
                } else {
                    c11595xv0.set(Long.valueOf(longValue));
                }
                Cursor cursor2 = c0366Cv02.a;
                if (cursor2 != null) {
                    cursor2.close();
                }
                threadLocal.set(c0366Cv0);
                return k2;
            } catch (C0626Ev0 e2) {
                Log.w("DynamiteModule", "Failed to load remote module: " + e2.getMessage());
                int i3 = a.a;
                if (i3 == 0 || interfaceC1016Hv0.a(context, str, new C0496Dv0(i3)).c != -1) {
                    throw new C0626Ev0("Remote load failed. No local fallback found.", e2);
                }
                C1146Iv0 j3 = j(context, str);
                if (longValue == 0) {
                    c11595xv0.remove();
                } else {
                    c11595xv0.set(Long.valueOf(longValue));
                }
                Cursor cursor3 = c0366Cv02.a;
                if (cursor3 != null) {
                    cursor3.close();
                }
                threadLocal.set(c0366Cv0);
                return j3;
            }
        } catch (Throwable th) {
            if (longValue == 0) {
                c11595xv0.remove();
            } else {
                c11595xv0.set(Long.valueOf(longValue));
            }
            Cursor cursor4 = c0366Cv02.a;
            if (cursor4 != null) {
                cursor4.close();
            }
            threadLocal.set(c0366Cv0);
            throw th;
        }
    }

    public static Field e(Context context) {
        return context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
    }

    public static boolean b(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(h)) {
            return true;
        }
        boolean z = false;
        if (h == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (C9228r11.b.c(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            h = valueOf;
            z = valueOf.booleanValue();
            if (z && resolveContentProvider != null && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0075, code lost:            if (r3 != false) goto L32;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int f(android.content.Context r11, java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1146Iv0.f(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x009d A[Catch: all -> 0x00a6, TryCatch #1 {all -> 0x00a6, blocks: (B:39:0x006f, B:40:0x0076, B:43:0x0098, B:45:0x009d, B:46:0x009e, B:47:0x00a5), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009e A[Catch: all -> 0x00a6, TryCatch #1 {all -> 0x00a6, blocks: (B:39:0x006f, B:40:0x0076, B:43:0x0098, B:45:0x009d, B:46:0x009e, B:47:0x00a5), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int g(android.content.Context r5, java.lang.String r6, boolean r7, boolean r8) {
        /*
            r0 = 0
            xv0 r1 = defpackage.C1146Iv0.j     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            android.database.Cursor r5 = n(r5, r6, r7, r1)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            if (r5 == 0) goto L7f
            boolean r6 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L91
            if (r6 == 0) goto L7f
            r6 = 0
            int r7 = r5.getInt(r6)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L91
            if (r7 <= 0) goto L69
            java.lang.Class<Iv0> r1 = defpackage.C1146Iv0.class
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L91
            r2 = 2
            java.lang.String r2 = r5.getString(r2)     // Catch: java.lang.Throwable -> L66
            defpackage.C1146Iv0.e = r2     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = "loaderVersion"
            int r2 = r5.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L66
            if (r2 < 0) goto L38
            int r2 = r5.getInt(r2)     // Catch: java.lang.Throwable -> L66
            defpackage.C1146Iv0.g = r2     // Catch: java.lang.Throwable -> L66
        L38:
            java.lang.String r2 = "disableStandaloneDynamiteLoader2"
            int r2 = r5.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L66
            r3 = 1
            if (r2 < 0) goto L4d
            int r2 = r5.getInt(r2)     // Catch: java.lang.Throwable -> L66
            if (r2 == 0) goto L49
            r2 = r3
            goto L4a
        L49:
            r2 = r6
        L4a:
            defpackage.C1146Iv0.f = r2     // Catch: java.lang.Throwable -> L66
            goto L4e
        L4d:
            r2 = r6
        L4e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L66
            java.lang.ThreadLocal r1 = defpackage.C1146Iv0.i     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L91
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L91
            Cv0 r1 = (defpackage.C0366Cv0) r1     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L91
            if (r1 == 0) goto L60
            android.database.Cursor r4 = r1.a     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L91
            if (r4 != 0) goto L60
            r1.a = r5     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L91
            r6 = r3
        L60:
            if (r6 == 0) goto L63
            goto L64
        L63:
            r0 = r5
        L64:
            r6 = r2
            goto L6a
        L66:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L66
            throw r6     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L91
        L69:
            r0 = r5
        L6a:
            if (r8 == 0) goto L79
            if (r6 != 0) goto L6f
            goto L79
        L6f:
            Ev0 r5 = new Ev0     // Catch: java.lang.Exception -> L77 java.lang.Throwable -> La6
            java.lang.String r6 = "forcing fallback to container DynamiteLoader impl"
            r5.<init>(r6)     // Catch: java.lang.Exception -> L77 java.lang.Throwable -> La6
            throw r5     // Catch: java.lang.Exception -> L77 java.lang.Throwable -> La6
        L77:
            r6 = move-exception
            goto L98
        L79:
            if (r0 == 0) goto L7e
            r0.close()
        L7e:
            return r7
        L7f:
            java.lang.String r6 = "DynamiteModule"
            java.lang.String r7 = "Failed to retrieve remote module version."
            android.util.Log.w(r6, r7)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L91
            Ev0 r6 = new Ev0     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L91
            java.lang.String r7 = "Failed to connect to dynamite module ContentResolver."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L91
            throw r6     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L91
        L8e:
            r6 = move-exception
            r0 = r5
            goto La7
        L91:
            r6 = move-exception
            r0 = r5
            goto L98
        L94:
            r5 = move-exception
            goto La8
        L96:
            r5 = move-exception
            r6 = r5
        L98:
            boolean r5 = r6 instanceof defpackage.C0626Ev0     // Catch: java.lang.Throwable -> La6
            if (r5 == 0) goto L9e
            throw r6     // Catch: java.lang.Throwable -> La6
        L9e:
            Ev0 r5 = new Ev0     // Catch: java.lang.Throwable -> La6
            java.lang.String r7 = "V2 version check failed"
            r5.<init>(r7, r6)     // Catch: java.lang.Throwable -> La6
            throw r5     // Catch: java.lang.Throwable -> La6
        La6:
            r6 = move-exception
        La7:
            r5 = r6
        La8:
            if (r0 == 0) goto Lad
            r0.close()
        Lad:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1146Iv0.g(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    public static Cursor n(Context context, String str, boolean z, long j2) {
        return context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(z ? "api_force_staging" : "api").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(j2)).build(), null, null, null, null);
    }

    public static C1146Iv0 j(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of " + str);
        return new C1146Iv0(context.getApplicationContext());
    }

    public static C1146Iv0 k(int i2, Context context, String str) {
        Boolean bool;
        try {
            synchronized (C1146Iv0.class) {
                if (!b(context)) {
                    throw new C0626Ev0("Remote loading disabled");
                }
                bool = b;
            }
            if (bool == null) {
                throw new C0626Ev0("Failed to determine which loading route to use.");
            }
            if (bool.booleanValue()) {
                return m(i2, context, str);
            }
            return l(i2, context, str);
        } catch (C0626Ev0 e2) {
            throw e2;
        } catch (RemoteException e3) {
            throw new C0626Ev0("Failed to load remote module.", e3);
        } catch (Throwable th) {
            throw new C0626Ev0("Failed to load remote module.", th);
        }
    }

    public static C1146Iv0 l(int i2, Context context, String str) {
        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i2);
        InterfaceC1956Pb1 d2 = d(context);
        if (d2 == null) {
            throw new C0626Ev0("Failed to create IDynamiteLoader.");
        }
        C1696Nb1 c1696Nb1 = (C1696Nb1) d2;
        Parcel e2 = c1696Nb1.e(6, c1696Nb1.a());
        int readInt = e2.readInt();
        e2.recycle();
        InterfaceC9436re1 interfaceC9436re1 = null;
        if (readInt >= 3) {
            C0366Cv0 c0366Cv0 = (C0366Cv0) i.get();
            if (c0366Cv0 == null) {
                throw new C0626Ev0("No cached result cursor holder");
            }
            ObjectWrapper objectWrapper = new ObjectWrapper(context);
            ObjectWrapper objectWrapper2 = new ObjectWrapper(c0366Cv0.a);
            Parcel a = c1696Nb1.a();
            AbstractC11786yV.c(a, objectWrapper);
            a.writeString(str);
            a.writeInt(i2);
            AbstractC11786yV.c(a, objectWrapper2);
            Parcel e3 = c1696Nb1.e(8, a);
            IBinder readStrongBinder = e3.readStrongBinder();
            String str2 = AbstractBinderC8751pe1.DESCRIPTOR;
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(AbstractBinderC8751pe1.DESCRIPTOR);
                interfaceC9436re1 = queryLocalInterface instanceof InterfaceC9436re1 ? (InterfaceC9436re1) queryLocalInterface : new C8408oe1(readStrongBinder);
            }
            e3.recycle();
        } else if (readInt == 2) {
            Log.w("DynamiteModule", "IDynamite loader version = 2");
            ObjectWrapper objectWrapper3 = new ObjectWrapper(context);
            Parcel a2 = c1696Nb1.a();
            AbstractC11786yV.c(a2, objectWrapper3);
            a2.writeString(str);
            a2.writeInt(i2);
            Parcel e4 = c1696Nb1.e(4, a2);
            IBinder readStrongBinder2 = e4.readStrongBinder();
            String str3 = AbstractBinderC8751pe1.DESCRIPTOR;
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(AbstractBinderC8751pe1.DESCRIPTOR);
                interfaceC9436re1 = queryLocalInterface2 instanceof InterfaceC9436re1 ? (InterfaceC9436re1) queryLocalInterface2 : new C8408oe1(readStrongBinder2);
            }
            e4.recycle();
        } else {
            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
            ObjectWrapper objectWrapper4 = new ObjectWrapper(context);
            Parcel a3 = c1696Nb1.a();
            AbstractC11786yV.c(a3, objectWrapper4);
            a3.writeString(str);
            a3.writeInt(i2);
            Parcel e5 = c1696Nb1.e(2, a3);
            IBinder readStrongBinder3 = e5.readStrongBinder();
            String str4 = AbstractBinderC8751pe1.DESCRIPTOR;
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface(AbstractBinderC8751pe1.DESCRIPTOR);
                interfaceC9436re1 = queryLocalInterface3 instanceof InterfaceC9436re1 ? (InterfaceC9436re1) queryLocalInterface3 : new C8408oe1(readStrongBinder3);
            }
            e5.recycle();
        }
        Object h1 = ObjectWrapper.h1(interfaceC9436re1);
        if (h1 != null) {
            return new C1146Iv0((Context) h1);
        }
        throw new C0626Ev0("Failed to load remote module.");
    }

    public static InterfaceC1956Pb1 d(Context context) {
        InterfaceC1956Pb1 c1696Nb1;
        synchronized (C1146Iv0.class) {
            InterfaceC1956Pb1 interfaceC1956Pb1 = c;
            if (interfaceC1956Pb1 != null) {
                return interfaceC1956Pb1;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                int i2 = AbstractBinderC1826Ob1.a;
                if (iBinder == null) {
                    c1696Nb1 = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof InterfaceC1956Pb1) {
                        c1696Nb1 = (InterfaceC1956Pb1) queryLocalInterface;
                    } else {
                        c1696Nb1 = new C1696Nb1(iBinder);
                    }
                }
                if (c1696Nb1 != null) {
                    c = c1696Nb1;
                    return c1696Nb1;
                }
            } catch (Exception e2) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e2.getMessage());
            }
            return null;
        }
    }

    public static C1146Iv0 m(int i2, Context context, String str) {
        InterfaceC2346Sb1 interfaceC2346Sb1;
        Boolean valueOf;
        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i2);
        synchronized (C1146Iv0.class) {
            interfaceC2346Sb1 = d;
        }
        if (interfaceC2346Sb1 == null) {
            throw new C0626Ev0("DynamiteLoaderV2 was not cached.");
        }
        C0366Cv0 c0366Cv0 = (C0366Cv0) i.get();
        if (c0366Cv0 == null || c0366Cv0.a == null) {
            throw new C0626Ev0("No result cursor");
        }
        Context applicationContext = context.getApplicationContext();
        Cursor cursor = c0366Cv0.a;
        InterfaceC9436re1 interfaceC9436re1 = null;
        new ObjectWrapper(null);
        synchronized (C1146Iv0.class) {
            valueOf = Boolean.valueOf(g >= 2);
        }
        if (valueOf.booleanValue()) {
            ObjectWrapper objectWrapper = new ObjectWrapper(applicationContext);
            ObjectWrapper objectWrapper2 = new ObjectWrapper(cursor);
            C2086Qb1 c2086Qb1 = (C2086Qb1) interfaceC2346Sb1;
            Parcel a = c2086Qb1.a();
            AbstractC11786yV.c(a, objectWrapper);
            a.writeString(str);
            a.writeInt(i2);
            AbstractC11786yV.c(a, objectWrapper2);
            Parcel e2 = c2086Qb1.e(3, a);
            IBinder readStrongBinder = e2.readStrongBinder();
            String str2 = AbstractBinderC8751pe1.DESCRIPTOR;
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(AbstractBinderC8751pe1.DESCRIPTOR);
                interfaceC9436re1 = queryLocalInterface instanceof InterfaceC9436re1 ? (InterfaceC9436re1) queryLocalInterface : new C8408oe1(readStrongBinder);
            }
            e2.recycle();
        } else {
            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
            ObjectWrapper objectWrapper3 = new ObjectWrapper(applicationContext);
            ObjectWrapper objectWrapper4 = new ObjectWrapper(cursor);
            C2086Qb1 c2086Qb12 = (C2086Qb1) interfaceC2346Sb1;
            Parcel a2 = c2086Qb12.a();
            AbstractC11786yV.c(a2, objectWrapper3);
            a2.writeString(str);
            a2.writeInt(i2);
            AbstractC11786yV.c(a2, objectWrapper4);
            Parcel e3 = c2086Qb12.e(2, a2);
            IBinder readStrongBinder2 = e3.readStrongBinder();
            String str3 = AbstractBinderC8751pe1.DESCRIPTOR;
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(AbstractBinderC8751pe1.DESCRIPTOR);
                interfaceC9436re1 = queryLocalInterface2 instanceof InterfaceC9436re1 ? (InterfaceC9436re1) queryLocalInterface2 : new C8408oe1(readStrongBinder2);
            }
            e3.recycle();
        }
        Context context2 = (Context) ObjectWrapper.h1(interfaceC9436re1);
        if (context2 != null) {
            return new C1146Iv0(context2);
        }
        throw new C0626Ev0("Failed to get module context");
    }

    public static void a(ClassLoader classLoader) {
        InterfaceC2346Sb1 c2086Qb1;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            int i2 = AbstractBinderC2216Rb1.a;
            if (iBinder == null) {
                c2086Qb1 = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof InterfaceC2346Sb1) {
                    c2086Qb1 = (InterfaceC2346Sb1) queryLocalInterface;
                } else {
                    c2086Qb1 = new C2086Qb1(iBinder);
                }
            }
            d = c2086Qb1;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new C0626Ev0("Failed to instantiate dynamite loader", e2);
        }
    }

    public final IBinder h(String str) {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new C0626Ev0("Failed to instantiate module class: ".concat(str), e2);
        }
    }

    public C1146Iv0(Context context) {
        this.a = context;
    }
}
