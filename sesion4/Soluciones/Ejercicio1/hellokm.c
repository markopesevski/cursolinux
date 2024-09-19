#include <linux/init.h>
#include <linux/module.h>

MODULE_AUTHOR("SEnsei"); 
MODULE_DESCRIPTION("El primer modulo que saluda"); 
MODULE_LICENSE("GPL");
MODULE_VERSION("1.0");

static int __init hellokm_init(void)
{
    	printk(KERN_INFO "Hello World from Kernel\n");
        return 0;
}

static void __exit hellokm_exit(void)
{
    	printk(KERN_INFO "Goodbye World\n");
}

module_init(hellokm_init);
module_exit(hellokm_exit);

