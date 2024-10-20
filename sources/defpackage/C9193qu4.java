package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qu4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9193qu4 {
    public final /* synthetic */ int a = 2;

    public C9193qu4(Object obj) {
    }

    public C9193qu4(AbstractC7131ku4 abstractC7131ku4) {
    }

    public C9193qu4(AbstractC7475lu4 abstractC7475lu4) {
    }

    public C9193qu4(AbstractC7819mu4 abstractC7819mu4) {
    }

    public C9193qu4(AbstractC8163nu4 abstractC8163nu4) {
    }

    public C9193qu4(AbstractC8507ou4 abstractC8507ou4) {
    }

    public static void c(ClassLoader classLoader, HashSet hashSet) {
        if (hashSet.isEmpty()) {
            return;
        }
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            String valueOf = String.valueOf(file.getParentFile().getAbsolutePath());
            if (valueOf.length() != 0) {
                "Adding native library parent directory: ".concat(valueOf);
            }
            hashSet2.add(file.getParentFile());
        }
        C11936yu4 c = Au4.c(e(classLoader), "nativeLibraryDirectories", File.class);
        hashSet2.removeAll(Arrays.asList((File[]) c.a()));
        synchronized (AbstractC5425fw4.class) {
            hashSet2.size();
            c.d(hashSet2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d7, code lost:            if (((java.lang.Boolean) defpackage.Au4.d(java.lang.Class.forName("dalvik.system.DexFile"), r16.getPath())).booleanValue() == false) goto L28;     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0159 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean d(java.lang.ClassLoader r14, java.io.File r15, java.io.File r16, boolean r17, defpackage.C9878su4 r18, java.lang.String r19, defpackage.C11250wu4 r20) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9193qu4.d(java.lang.ClassLoader, java.io.File, java.io.File, boolean, su4, java.lang.String, wu4):boolean");
    }

    public static Object e(ClassLoader classLoader) {
        Field f = Au4.f(classLoader, "pathList");
        try {
            return Object.class.cast(f.get(classLoader));
        } catch (Exception e) {
            throw new Cu4(String.format("Failed to get value of field %s of type %s on object of type %s", f.getName(), classLoader.getClass().getName(), Object.class.getName()), e);
        }
    }

    public static C9878su4 f() {
        return new C9878su4(0);
    }

    public static C11250wu4 g() {
        return new C11250wu4(0);
    }

    public static void h(ClassLoader classLoader, HashSet hashSet, C10564uu4 c10564uu4) {
        if (hashSet.isEmpty()) {
            return;
        }
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            hashSet2.add(((File) it.next()).getParentFile());
        }
        Object e = e(classLoader);
        C11936yu4 c11936yu4 = new C11936yu4(e, Au4.f(e, "nativeLibraryDirectories"), List.class);
        synchronized (AbstractC5425fw4.class) {
            ArrayList arrayList = new ArrayList((Collection) c11936yu4.a());
            hashSet2.removeAll(arrayList);
            arrayList.addAll(hashSet2);
            c11936yu4.b(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(hashSet2);
        Object[] objArr = (Object[]) (c10564uu4.a != 0 ? Au4.b(e, "makePathElements", List.class, arrayList3, null, List.class, arrayList2) : Au4.a(e, "makePathElements", Object[].class, List.class, arrayList3));
        if (arrayList2.isEmpty()) {
            synchronized (AbstractC5425fw4.class) {
                Au4.c(e, "nativeLibraryPathElements", Object.class).d(Arrays.asList(objArr));
            }
            return;
        }
        C11593xu4 c11593xu4 = new C11593xu4("Error in makePathElements");
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            Zu4.a(c11593xu4, (IOException) arrayList2.get(i));
        }
        throw c11593xu4;
    }

    public static C10564uu4 i() {
        return new C10564uu4(0);
    }

    public static boolean j(ClassLoader classLoader, File file, File file2, boolean z) {
        return d(classLoader, file, file2, z, new C9878su4(), "zip", g());
    }

    public final void a(ClassLoader classLoader, HashSet hashSet) {
        switch (this.a) {
            case 0:
                c(classLoader, hashSet);
                return;
            case 1:
                c(classLoader, hashSet);
                return;
            case 2:
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
            case 4:
                h(classLoader, hashSet, i());
                return;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                h(classLoader, hashSet, new C10564uu4());
                return;
            case 6:
                h(classLoader, hashSet, new C10564uu4());
                return;
            default:
                h(classLoader, hashSet, new C10564uu4());
                return;
        }
    }

    public final boolean b(ClassLoader classLoader, File file, File file2, boolean z) {
        C9878su4 c9878su4;
        C11250wu4 c11250wu4;
        String str;
        switch (this.a) {
            case 0:
            case 1:
                c9878su4 = f();
                c11250wu4 = g();
                str = "zip";
                break;
            case 2:
                return j(classLoader, file, file2, z);
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return j(classLoader, file, file2, z);
            case 4:
                return j(classLoader, file, file2, z);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return d(classLoader, file, file2, z, new C9878su4(), "path", new C11250wu4());
            case 6:
                return d(classLoader, file, file2, z, new C9878su4(), "path", new C11250wu4());
            default:
                c9878su4 = new C9878su4();
                c11250wu4 = new C11250wu4((Object) null);
                str = "path";
                break;
        }
        return d(classLoader, file, file2, z, c9878su4, str, c11250wu4);
    }
}
