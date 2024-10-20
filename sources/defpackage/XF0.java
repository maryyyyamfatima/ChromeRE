package defpackage;

import com.google.protobuf.MessageLite;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class XF0 {
    public static volatile XF0 b;
    public static volatile XF0 c;
    public static final XF0 d = new XF0(0);
    public final Map a;

    public static XF0 c() {
        XF0 xf0 = b;
        if (xf0 == null) {
            synchronized (XF0.class) {
                xf0 = b;
                if (xf0 == null) {
                    xf0 = d;
                    b = xf0;
                }
            }
        }
        return xf0;
    }

    public static XF0 d() {
        String format;
        XF0 xf0;
        XF0 xf02 = c;
        if (xf02 != null) {
            return xf02;
        }
        synchronized (XF0.class) {
            XF0 xf03 = c;
            if (xf03 != null) {
                return xf03;
            }
            int i = HX0.a;
            ClassLoader classLoader = HX0.class.getClassLoader();
            if (XF0.class.equals(XF0.class)) {
                format = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
            } else {
                if (!XF0.class.getPackage().equals(HX0.class.getPackage())) {
                    throw new IllegalArgumentException(XF0.class.getName());
                }
                format = String.format("%s.BlazeGenerated%sLoader", XF0.class.getPackage().getName(), XF0.class.getSimpleName());
            }
            try {
                try {
                    xf0 = (XF0) XF0.class.cast(((HX0) Class.forName(format, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).a());
                } catch (IllegalAccessException e) {
                    throw new IllegalStateException(e);
                } catch (InstantiationException e2) {
                    throw new IllegalStateException(e2);
                } catch (NoSuchMethodException e3) {
                    throw new IllegalStateException(e3);
                } catch (InvocationTargetException e4) {
                    throw new IllegalStateException(e4);
                }
            } catch (ClassNotFoundException unused) {
                Iterator a = GX0.a();
                ArrayList arrayList = new ArrayList();
                while (a.hasNext()) {
                    try {
                        arrayList.add(XF0.class.cast(((HX0) a.next()).a()));
                    } catch (ServiceConfigurationError unused2) {
                        Level level = Level.SEVERE;
                        throw null;
                    }
                }
                if (arrayList.size() == 1) {
                    xf0 = (XF0) arrayList.get(0);
                } else if (arrayList.size() == 0) {
                    xf0 = null;
                } else {
                    try {
                        try {
                            try {
                                xf0 = (XF0) XF0.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                            } catch (InvocationTargetException e5) {
                                throw new IllegalStateException(e5);
                            }
                        } catch (NoSuchMethodException e6) {
                            throw new IllegalStateException(e6);
                        }
                    } catch (IllegalAccessException e7) {
                        throw new IllegalStateException(e7);
                    }
                }
            }
            c = xf0;
            return xf0;
        }
    }

    public OX0 b(MessageLite messageLite, int i) {
        return (OX0) this.a.get(new WF0(i, messageLite));
    }

    public final void a(OX0 ox0) {
        this.a.put(new WF0(ox0.d.a, ox0.a), ox0);
    }

    public XF0() {
        this.a = new HashMap();
    }

    public XF0(int i) {
        this.a = Collections.emptyMap();
    }
}
