import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Esta es la fabrica que permite generar diferentes tipos de {@link Set}'s
 */
public enum SetFactory {
    ;
    public static final int HASH_SET = 0;
    public static final int TREE_SET = 1;
    public static final int LINKED_HASH_SET = 2;
    private static int s_setInicial = 10;

    /**
     * Genera una nueva instancia de las clases de {@link Set}s para el Set.
     *
     * @param tipo el tipo de {@link Set} a utilizar
     *
     * @return el Set solicitado
     */
    static <T> Set<T> getSet(final int tipo) {
        switch (tipo) {
            case HASH_SET:
                return new HashSet<T>(s_setInicial);
            case TREE_SET:
                return new TreeSet<T>();
            case LINKED_HASH_SET:
                return new LinkedHashSet<T>(s_setInicial);
            default:
                return null;
        }
    }

    /**
     * @param setInicial el nuevo valor inicial del tamaño de los {@link HashSet} y {@link TreeSet}
     */
    public static void setVectorInicial(final int setInicial) {
        if (setInicial > 0) {
            s_setInicial = setInicial;
        }
    }
}
